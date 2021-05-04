import { EventEmitter, Output } from '@angular/core';
import { Component, OnInit } from '@angular/core';
import { Busqueda } from 'app/Modelo/busqueda';
import { Router } from '@angular/router'

@Component({
  selector: 'app-filtros',
  templateUrl: './filtros.component.html',
  styleUrls: ['./filtros.component.css']
})

export class FiltrosComponent implements OnInit {
  @Output() filtrosBusquedaOutPut = new EventEmitter<Busqueda>();

  constructor(private router: Router) { }

  ngOnInit(): void {
    this.filtrosBusquedaOutPut.emit(this.busqueda);
  }

  busqueda: Busqueda = {
    ciudad:"",
    precioDesde: 0,
    precioHasta: 1000000,
    superficieDesde: 0,
    superficieHasta: 1000000,
    numeroBanosMinimos: 0,
    numeroBanosMaximos: 14,
    numeroHabitacionesMinimas: 1,
    numeroHabitacionesMaximas: 15,
    //tipoVivienda: [],
    servicios: ["padel"],
    alquilar: false,
    comprar: true
  }

  errorSuperficieMinima : boolean = true;
  errorSuperficieMaxima : boolean = true;
  errorPrecioMinimo: boolean = true;
  errorPrecioMaximo : boolean = true;

  aplicarFiltro(event: any){
    this.filtrosBusquedaOutPut.emit(this.busqueda);
    console.log(event.target.value);
    console.log(this.busqueda.precioHasta);
  }

  aplicarFiltroPrecioMinimo(event: any){
    if(event.target.value > this.busqueda.precioHasta){
      this.errorPrecioMinimo = false;
    }else{
    this.busqueda.precioDesde = event.target.value;
    console.log(event.target.value);
    console.log(this.busqueda.precioDesde);
    this.filtrosBusquedaOutPut.emit(this.busqueda);
    this.errorPrecioMinimo = true;
    }
  }

  aplicarFiltroPrecioMaximo(event: any){
    if(event.target.value < this.busqueda.precioDesde){
      this.errorPrecioMinimo = false;
    }else{
    this.busqueda.precioHasta = event.target.value;
    console.log(event.target.value);
    console.log(this.busqueda.precioHasta);
    this.filtrosBusquedaOutPut.emit(this.busqueda);
    this.errorPrecioMaximo = true;
    }
  }

  aplicarFiltroSuperficieMinima(event: any){
    if(event.target.value > this.busqueda.superficieHasta){
      this.errorSuperficieMinima =false;
    }else{
    this.busqueda.superficieDesde = event.target.value;
    console.log(event.target.value);
    console.log(this.busqueda.superficieDesde);
    this.filtrosBusquedaOutPut.emit(this.busqueda);
    this.errorSuperficieMinima =true;
    }
  }

  aplicarFiltroSuperficieMaxima(event: any){
    if(event.target.value < this.busqueda.superficieDesde){
      this.errorSuperficieMaxima = false;
    }else{
    this.busqueda.superficieHasta = event.target.value;
    console.log(event.target.value);
    console.log(this.busqueda.superficieHasta);
    this.filtrosBusquedaOutPut.emit(this.busqueda);
    this.errorSuperficieMaxima =true;
    }
  }

  aplicarFiltroBanos(event: any){
    this.busqueda.numeroBanosMinimos = event.value;
    console.log(event.value);
    console.log(this.busqueda.numeroBanosMinimos);
    this.filtrosBusquedaOutPut.emit(this.busqueda);
  }

  aplicarFiltroHabitaciones(event: any){
    this.busqueda.numeroHabitacionesMinimas = event.value;
    console.log(event.value);
    console.log(this.busqueda.numeroHabitacionesMinimas);
    this.filtrosBusquedaOutPut.emit(this.busqueda);
  }

  aplicarFiltroComprar(){
    this.busqueda.comprar = true;
    this.busqueda.alquilar = false;
    this.filtrosBusquedaOutPut.emit(this.busqueda);
  }

  aplicarFiltroAlquilar(){
    this.busqueda.comprar = false;
    this.busqueda.alquilar = true;
    this.filtrosBusquedaOutPut.emit(this.busqueda);
  }

  publicarInmueble() {
    this.router.navigateByUrl("/addEditInmueble")
  }

  irPaginaVisualizarInmueble(){
    this.router.navigateByUrl("/vistaInmueble");
  }
}


