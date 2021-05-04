import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEditInmuebleComponent } from './add-edit-inmueble.component';

describe('AddEditInmuebleComponent', () => {
  let component: AddEditInmuebleComponent;
  let fixture: ComponentFixture<AddEditInmuebleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddEditInmuebleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEditInmuebleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
