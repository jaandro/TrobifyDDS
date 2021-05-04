import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaginaVisualizarInmuebleComponent } from './pagina-visualizar-inmueble.component';

describe('PaginaVisualizarInmuebleComponent', () => {
  let component: PaginaVisualizarInmuebleComponent;
  let fixture: ComponentFixture<PaginaVisualizarInmuebleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PaginaVisualizarInmuebleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PaginaVisualizarInmuebleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
