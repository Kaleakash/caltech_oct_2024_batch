import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerViewProductComponent } from './customer-view-product.component';

describe('CustomerViewProductComponent', () => {
  let component: CustomerViewProductComponent;
  let fixture: ComponentFixture<CustomerViewProductComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CustomerViewProductComponent]
    });
    fixture = TestBed.createComponent(CustomerViewProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
