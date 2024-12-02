import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
products:Array<Product>=[];     // it hold array of products 
flag:boolean = false;
dateInfo = new Date();
  constructor(public ps:ProductService){  // DI for ProductService 

  }

  loadProduct(): void {
    this.ps.loadFakeDataDisplayOnConsole(); // display on console 

    this.flag=true;
    this.ps.loadFakeProductAndDisplayOnBrowser().subscribe({
      next:(values:any)=>this.products=values,

      error:(error:any)=>console.log(error),

      complete:()=>console.log("completed")
    })
  }
}
