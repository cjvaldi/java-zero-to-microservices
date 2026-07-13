import { HttpClient } from '@angular/common/http';
import { Injectable, Service } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Product } from '../models/product';

@Injectable({
  providedIn: 'root',
})  
export class ProductService {

    private url: string = 'http://localhost:8080';

    constructor(private http: HttpClient) {}

    findAll():Observable<Product[]> {
        return this.http.get(this.url).pipe(
            map((response: any) => response as Product[])
        );
    }

    crete(product: Product): Observable<Product> {
        console.log('Crear producto:', product);
        return this.http.post<Product>(this.url, product);
    }

    update(product: Product): Observable<Product> {
        return this.http.put<Product>(`${this.url}/${product.id}`, product);
    }

    remove(id: number): Observable<Product> {
        return this.http.delete<Product>(`${this.url}/${id}`);
    }
}