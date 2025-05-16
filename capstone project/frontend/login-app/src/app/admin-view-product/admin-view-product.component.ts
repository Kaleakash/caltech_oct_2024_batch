import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-admin-view-product',
  templateUrl: './admin-view-product.component.html',
  styleUrls: ['./admin-view-product.component.css']
})
export class AdminViewProductComponent implements OnInit{

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
