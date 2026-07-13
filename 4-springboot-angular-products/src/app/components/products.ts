import { ChangeDetectorRef, Component, EventEmitter, Input, OnChanges, Output, SimpleChanges } from '@angular/core';
import { Product } from '../models/product';

@Component({
  selector: 'table-products',
  imports: [],
  templateUrl: './products.html',
})
export class Products implements OnChanges {

  @Input () products: Product[] = [];

  title: string = 'Listado de Productos';

  @Output() updateProductEvent = new EventEmitter();
  @Output() removeProductEvent = new EventEmitter();

  constructor(private cdr: ChangeDetectorRef) {}

  ngOnChanges(changes: SimpleChanges): void {
    if (changes['products']) {
      this.cdr.detectChanges();
    }
  }

  onUpdateProduct(product: Product): void {
      this.updateProductEvent.emit(product);
  }
  onRemoveProduct(id: number): void {
    this.removeProductEvent.emit(id);
  }
}
