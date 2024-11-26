import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.css']
})
export class AttributeDirectiveComponent {
  styleValues={"background-color":"yellow"}
  f1:boolean=true;
  f2:boolean=false;
  fun1(): void {
      this.f1=!this.f1;
  }
  fun2() : void {
    this.f2=!this.f2;
  }
}
