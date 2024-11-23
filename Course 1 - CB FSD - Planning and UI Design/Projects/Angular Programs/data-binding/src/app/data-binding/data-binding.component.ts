import { Component } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent {
id:number=100;
fname:string = "Ambrose"
result:string =""
changeValue():void {
  this.id=200;
  this.fname="Ambrose Miner"
}
add(n1:any,n2:any): void {
  let a=n1.value;
  let b=n2.value;
  let result1 = eval(a)+eval(b);
  console.log("Sum is "+result1);
  this.result="Sum of two number is "+result1;
}
sub(n1:any,n2:any): void {
  let a=n1.value;
  let b=n2.value;
  let result2 = eval(a)-eval(b);
  console.log("Sub is "+result2);
  this.result="Sub of two number is "+result2;
}
}
