import { Component } from '@angular/core';

@Component({
  selector: 'app-string-interpolation',
  templateUrl: './string-interpolation.component.html',
  styleUrls: ['./string-interpolation.component.css']
})
export class StringInterpolationComponent {
id:number=100;
fname:string ="Steven";
age:number=34;
result:boolean=true;
n1:number=100;
n2:number=200;

  sayHello(name:string):string {
    return "Welcome to User "+name;
  }
}
