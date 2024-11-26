import { Component } from '@angular/core';

@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent {
f1:boolean=true;
f2:boolean=false;
f3:boolean = true;
names:Array<string>=["Steven","Lex","Raj"]

changeValue():void {
  if(this.f3){
    this.f3=false;
  }else {
    this.f3=true;
  }
}
addNames(nameref:any):void {
  this.names.push(nameref.value);
}

}
