import { Inmueble } from 'app/Modelo/inmueble';
import { Component, OnInit, ViewChild, ElementRef} from '@angular/core';
import { Router } from '@angular/router';
import { Imagen } from '../../Modelo/imagen';
import { MapsAPILoader } from '@agm/core';
import {} from '@angular/google-maps';
import { NgZone } from '@angular/core';

@Component({
  selector: 'app-pagina-visualizar-inmueble',
  templateUrl: './pagina-visualizar-inmueble.component.html',
  styleUrls: ['./pagina-visualizar-inmueble.component.css']
})
export class PaginaVisualizarInmuebleComponent implements OnInit {
  latlng = {
    lat: 0,
    lng: 0
  };

  public inmu : Inmueble = history.state.inmueble;
  public servicios = history.state.inmueble.servicios;
  public tipo = history.state.inmueble.tipoViviendas;
  public imagenMin: Array<Imagen> = [];

  constructor(private router:Router,private mapsAPILoader: MapsAPILoader, private ngZone: NgZone) {  }


  geoCoder!: google.maps.Geocoder;
  ciudad!: String;
  lati!: number;
  long!: number;





  //AQUI ASGNAMOS LAS FOTOS DEL INMUEBLE A UN ARRAY DE FOTOS PARA PODER MOSTRARLAS EN EL SLIDER
  ngOnInit(): void {

    for(let i = 0; i < history.state.inmueble.fotos.length; i++) {
      var dinamic: Imagen =
        {
          image: this.inmu.fotos[i].foto,
          thumbImage: this.inmu.fotos[i].foto,
          alt: '',
          title: ''
        }
      this.imagenMin[i] = dinamic;
      console.log(history.state.inmueble.fotos[i].foto)
    }

    this.latlng.lat = +this.inmu.latitud;
    this.latlng.lng = +this.inmu.longitud;
    console.log(this.tipo)
  }


  botonEnter(): void {
    this.router.navigateByUrl("/home", {state:{ciudad: this.ciudad, lat: this.lati, lng:this.long}});
  }



//FUNCIONALIDAD DE LOS BOTONES DE LA BARRA DE NAVEGACION

  irPaginaPrincipal(){
    this.router.navigateByUrl("/home");
  }

  irPublicarInmueble(){
    this.router.navigateByUrl("/addEditInmueble");
  }

}
