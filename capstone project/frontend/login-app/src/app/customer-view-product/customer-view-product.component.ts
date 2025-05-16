import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-customer-view-product',
  templateUrl: './customer-view-product.component.html',
  styleUrls: ['./customer-view-product.component.css']
})
export class CustomerViewProductComponent implements OnInit{

  products:Array<any>=[]
    constructor(public ps:ProductService){}
    ngOnInit(): void {
        this.retrieveProducts();
    }
  
    retrieveProducts() : void {
      this.ps.findProducts().subscribe({
        next:(result) => {
         this.products = result;
         
        },
        error:(error) => {
          alert("Error in storing product "+error);
        },
        complete:() => {
  
        }
  
      })
    }
}
