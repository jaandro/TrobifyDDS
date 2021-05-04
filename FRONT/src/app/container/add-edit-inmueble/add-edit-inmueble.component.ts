import { Foto } from './../../Modelo/foto';
import { Component, OnInit } from '@angular/core';
import { Inmueble } from 'app/Modelo/inmueble';
import { InmuebleService } from 'app/service/inmueble/inmueble.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-edit-inmueble',
  templateUrl: './add-edit-inmueble.component.html',
  styleUrls: ['./add-edit-inmueble.component.css']
})
export class AddEditInmuebleComponent implements OnInit {

  inmuebleDemo: Inmueble = {
    amueblado: true,
    ascensor: true,
    ciudad: "Valencia",
    consumoEnergia: 33,
    descripcion: "",
    estado: "Muy bueno",
    fechaConstruccion: new Date(),
    fotos: [],
    id: 10,
    latitud: 43,
    longitud: -3,
    numBanos: 3,
    numHabitaciones: 5,
    pais: "España",
    planta: 4,
    precio: 300,
    servicios: [],
    superficie: 150,
    tipoViviendas: []
}

  constructor(private service: InmuebleService, private router: Router) { }

  ngOnInit(): void {
  }

  publicar() {
    console.log(this.inmuebleDemo)
    this.service.addInuemble(this.inmuebleDemo).subscribe(data => {
      this.router.navigateByUrl("/home")
    })
  }

  cogerImg(event: string) {
    console.log(event)
    var dinamic: Foto = {
      foto: "event",
    }
    this.inmuebleDemo.fotos.push(dinamic)
    console.log(this.inmuebleDemo.fotos)
  }

  cogerCoordenadas(event: any) {
    this.inmuebleDemo.latitud = event.myLat
    this.inmuebleDemo.longitud = event.myLng
  }

  cogerTipo(event: any) {
    this.inmuebleDemo.tipoViviendas = event
  }

  cogerContrato(event: any) {
    // this.inmuebleDemo.tipoViviendas = event
    // console.log(this.inmuebleDemo)
  }

  cogerPrecio(event: any) {
    this.inmuebleDemo.precio = event
  }

  cogerHabitaciones(event: any) {
    this.inmuebleDemo.numHabitaciones = event
  }

  cogerSuperficie(event: any) {
    this.inmuebleDemo.superficie = event
  }

  cogerBanos(event: any) {
    this.inmuebleDemo.numBanos = event
    console.log(this.inmuebleDemo)
  }

}
