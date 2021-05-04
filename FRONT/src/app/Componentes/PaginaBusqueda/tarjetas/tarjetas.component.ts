import { Component, OnInit, ElementRef, ViewChild, NgZone, Input, OnChanges } from '@angular/core';
import { Inmueble } from 'app/Modelo/inmueble';
import {InmuebleService} from '../../../service/inmueble/inmueble.service'
import { Router } from '@angular/router'

@Component({
  selector: 'app-tarjetas',
  templateUrl: './tarjetas.component.html',
  styleUrls: ['./tarjetas.component.css']
})
export class TarjetasComponent implements OnChanges {
  @Input() datos: any;

  inmuebles: any[] = [];


  constructor(private router: Router) { }

  ngOnChanges(): void {
    console.log(this.datos);
    this.inmuebles = this.datos;
  }

  enviarInmueble(inmueble: Inmueble): void {
    this.router.navigateByUrl("/vistaInmueble", {state: {id: inmueble.id, inmueble: inmueble}});
  }


}
