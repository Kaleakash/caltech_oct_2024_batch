import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-admin-add-product',
  templateUrl: './admin-add-product.component.html',
  styleUrls: ['./admin-add-product.component.css']
})
export class AdminAddProductComponent {

  productForm = new FormGroup({
    pid:new FormControl(),
    pname:new FormControl(),
    price:new FormControl(),
  })
message:string ="";
products:Array<Product>=[]
  constructor(public ps:ProductService){}


  storeProduct(): void {
    let product = this.productForm.value;
    this.ps.storeProduct(product).subscribe({
      next:(result) => {
        this.message = result;
        this.productForm.reset();
      },
      error:(error) => {
        alert("Error in storing product "+error);
      },
      complete:() => {

      }

    })
  
  }

}
