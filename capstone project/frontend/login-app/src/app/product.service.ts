import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

baseURL:string="http://localhost:9090/product";
//baseURL:string="http://publicIpAddress:9090/product";

   // DI for HttpClient
constructor(public httpClient:HttpClient) { }

storeProduct(product:any):Observable<string>{
return this.httpClient.post(this.baseURL+"/store",product,{responseType:'text'});
}

  findProducts():Observable<Product[]>{
    return this.httpClient.get<Product[]>(this.baseURL+"/find");
  }
}
