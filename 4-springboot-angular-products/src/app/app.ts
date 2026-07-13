import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Products } from './components/products';
import { Product } from './models/product';
import { Form } from './components/form';
import Swal from 'sweetalert2';
import { ProductService } from './services/product';

@Component({
  selector: 'app-root',
  imports: [Products, Form],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App implements OnInit {
  products: Product[] = [];
  // countId = signal(3);
  productSelected: Product = new Product();

  constructor(private service: ProductService, private cdr: ChangeDetectorRef) {}

  ngOnInit(): void {
    this.service.findAll().subscribe((products) => {
      this.products = [...products];
      this.cdr.detectChanges();
    });
    // this.products = [
    //   {
    //     id: 1,
    //     name: 'Monitor Asus 30 pulgadas',
    //     description: 'Monitor  muy bueno para trabajar',
    //     price: 1050,
    //   },
    //   {
    //     id: 2,
    //     name: 'Iphone 15',
    //     description: 'Telefono que es muy bueno para trabajar',
    //     price: 1120,
    //   },
    // ];
  }

  addProduct(product: Product): void {
    if (product.id > 0) {
      this.service.update(product).subscribe((updatedProduct) => {
        this.products = this.products.map((prod) => {
          if (prod.id == product.id) {
            return { ...updatedProduct };
          }
          return prod;
        });
        this.cdr.detectChanges();
        Swal.fire({
          title: 'Producto actualizado!',
          text:`Producto ${updatedProduct.name} actualizado con éxito!`,
          icon: 'success',
        });
      });
    } else {
      this.service.crete(product).subscribe((productNew) => {
        this.products = [...this.products, { ...productNew }];
        this.cdr.detectChanges();
        // this.countId.update((id) => id + 1);
        Swal.fire({
          title: 'Producto Creado!',
          text: `Producto ${productNew.name} creado con éxito!`,
          icon: 'success',
        });
      });
    }
  }

  onUpdateProductEvent(product: Product): void {
    this.productSelected = { ...product };
    this.cdr.detectChanges();
  }

  onRemoveProductEvent(id: number): void {
    Swal.fire({
      title: 'Seguro que quieres eliminar?',
      text: 'Cuidado se eliminará el producto del sistema!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Si, eliminar!',
    }).then((result) => {
      if (result.isConfirmed)
        this.service.remove(id).subscribe((productDeleted) => {
          this.products = this.products.filter((product) => product.id != id);
          this.cdr.detectChanges();
          Swal.fire({
            title: 'Producto Eliminado!',
            text: `Producto ${productDeleted.name} eliminado con éxito!`,
            icon: 'success',
          });
        });
    });
  }
}
