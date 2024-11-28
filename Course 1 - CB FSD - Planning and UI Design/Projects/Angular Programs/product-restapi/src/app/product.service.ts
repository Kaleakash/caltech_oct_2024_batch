import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  constructor(public http:HttpClient) { }   // DI for HttpClient API. 

  loadFakeDataDisplayOnConsole(): void {
    this.http.get("https://fakestoreapi.com/products").subscribe({
      
      next:(value:any)=> console.log(value),

      error:(error:any)=>console.log(error),

      complete:()=>console.log("done!")

    })
  }
}
