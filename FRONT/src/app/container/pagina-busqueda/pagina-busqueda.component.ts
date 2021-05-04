import { Component, Input, OnInit } from '@angular/core';
import { Busqueda } from 'app/Modelo/busqueda';
import { Inmueble } from 'app/Modelo/inmueble';
import { ServiceService } from '../../service/service.service'

@Component({
  selector: 'app-pagina-busqueda',
  templateUrl: './pagina-busqueda.component.html',
  styleUrls: ['./pagina-busqueda.component.css']
})
export class PaginaBusquedaComponent implements OnInit {

  inmueblesFiltrados: Inmueble[] = []
  ciudadFiltrada: string = "";
  busqueda!: Busqueda;

  busquedaProvisional: Busqueda = {
    ciudad:"Valencia",
    precioDesde: 700,
    precioHasta: 1000000,
    superficieDesde: 0,
    superficieHasta: 1000000,
    numeroBanosMinimos: 0,
    numeroBanosMaximos: 14,
    numeroHabitacionesMinimas: 1,
    numeroHabitacionesMaximas: 15,
    alquilar: false,
    comprar: true
  }


  constructor(private service: ServiceService) { }

  ngOnInit(): void {
    this.ciudadFiltrada = history.state.ciudad;    
   }


  filtrar(event: Busqueda){
    this.busqueda = event;
    this.addCiudadToBusqueda();
    this.llamadaBDA();
  }

  ciudadFiltradaMetodo(event: string){
    this.ciudadFiltrada = event;
    this.addCiudadToBusqueda();
    this.llamadaBDA();
  }

  addCiudadToBusqueda(){
     this.busqueda.ciudad = this.ciudadFiltrada;
  }

  llamadaBDA(){
    this.service.busqueda(this.busqueda).subscribe(data => {
      if(data.length != 0){
        this.inmueblesFiltrados = data;
      }
      else{ this.service.busqueda(this.busquedaProvisional).subscribe(data => {
        this.inmueblesFiltrados = data;
      })
      }
    })
  }

}

