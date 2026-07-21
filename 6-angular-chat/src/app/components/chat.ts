import { CommonModule } from '@angular/common';
import { Component, ChangeDetectorRef, NgZone, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import * as Stomp from '@stomp/stompjs';
import SockJS from 'sockjs-client';
import { Message } from '../models/message';

@Component({
  selector: 'app-chat',
  imports: [FormsModule, CommonModule],
  templateUrl: './chat.html',
})
export class Chat implements OnInit {
  client!: Stomp.Client;
  connected: boolean = false;

  
  messages: Message[] = [];
  message: Message = new Message();
  
  writing!: string;
  clientId!: string;
  
  constructor(
    private ngZone: NgZone,
    private cdr: ChangeDetectorRef,
  ) {
    this.clientId = 'id-' + new Date().getTime() + '-' + Math.random().toString(36).substring(2);
    }
 

  ngOnInit(): void {
    this.client = new Stomp.Client({
      brokerURL: undefined,
      webSocketFactory: () => new SockJS('http://localhost:8080/chat-websocket'),
      debug: (str) => console.log(str),
      reconnectDelay: 5000,
    });

    this.client.onConnect = (frame) => {
      this.ngZone.run(() => {
        this.connected = true;
        this.cdr.markForCheck();
      });
      console.log(`Conectados: ${this.client.connected} : ${frame}`);

      this.client.subscribe('/chat/message', (e) => {
        this.ngZone.run(() => {
          console.log(e.body);
          let message: Message = JSON.parse(e.body) as Message;
          message.date = new Date(message.date);
          if (
            this.message.username == message.username &&
            !this.message.color &&
            message.type == 'NEW_USER'
          ) {
            this.message.color = message.color;
          }
          this.messages.push(message);
          this.cdr.markForCheck();
        });
      });

      this.client.subscribe('/chat/writing', (event) => {
        this.writing = event.body;
        setTimeout(() => (this.writing = ''), 3000);
      });
      
      console.log('clientId '+ this.clientId);
      this.client.subscribe(`/chat/history/${this.clientId}`, event => {
        const histories = JSON.parse(event.body) as Message[];
        this.messages = histories.map((message) => ({
          ...message,
          date: message.date ? new Date(message.date) : new Date(),
        }));
        this.messages.sort((a, b) => a.date.getTime() - b.date.getTime());
        this.cdr.markForCheck();
      });
      this.client.publish({ destination: '/app/history', body: this.clientId });

      this.message.type = 'NEW_USER';
      this.client.publish({
        destination: '/app/message',
        body: JSON.stringify(this.message),
      });
    };

    this.client.onDisconnect = (frame) => {
      this.ngZone.run(() => {
        this.connected = false;
        this.cdr.markForCheck();
        this.message = new Message();
        // No clear message history here, so previous conversation can be reloaded after reconnect.
        console.log(`Desconectados : ${!this.client.connected} : ${frame}`);
      });
    };
  }

  connect(): void {
    this.client.activate();
  }
  deconnect(): void {
    this.client.deactivate();
  }

  onSendMessage() {
    this.message.type = 'MESSAGE';
    this.client.publish({
      destination: '/app/message',
      body: JSON.stringify(this.message),
    });
    this.message.text = '';
  }

  onWritingEvent(): void {
    this.client.publish({
      destination: '/app/writing',
      body: this.message.username,
    });
  }
}
