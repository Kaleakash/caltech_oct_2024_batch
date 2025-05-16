import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminAddProductComponent } from './admin-add-product.component';

describe('AdminAddProductComponent', () => {
  let component: AdminAddProductComponent;
  let fixture: ComponentFixture<AdminAddProductComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdminAddProductComponent]
    });
    fixture = TestBed.createComponent(AdminAddProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
