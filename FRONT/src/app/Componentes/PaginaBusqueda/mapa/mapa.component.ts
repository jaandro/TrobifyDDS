import { Component, OnInit, ElementRef, ViewChild, NgZone, Input, OnChanges, Output, EventEmitter } from '@angular/core';
import { MapsAPILoader } from '@agm/core';
import {} from '@angular/google-maps';
import { Router } from '@angular/router'
import { Inmueble } from 'app/Modelo/inmueble';

@Component({
  selector: 'app-mapa',
  templateUrl: './mapa.component.html',
  styleUrls: ['./mapa.component.css']
})
export class MapaComponent implements OnChanges, OnInit {
  @Input() datos: any
  
  @Output() ciudadOutPut = new EventEmitter<string>();

  lat: number = history.state.lat;
  geoCoder!: google.maps.Geocoder;
  lng: number = history.state.lng;
  zoom: number = 9;
  inmuebles: any[] = [];

  labelOptions = {
    color: 'blue',
    fontFamily: '',
    fontSize: '20px',
    fontWeight: 'bold',
    text: "some text"
  }

  latlng = {
    lat: 0,
    lng: 0
  };

  @ViewChild('search')
  public searchElementRef!: ElementRef;

  constructor(private mapsAPILoader: MapsAPILoader, private ngZone: NgZone,private router: Router) { }
  ngOnInit(): void {
    if(history.state.lat == undefined){
      this.lat =  40.463667;
      this.lng = -3.74922;
      this.zoom = 6;  
    };
  }

  ngOnChanges(): void {
    this.inmuebles = this.datos;
    this.mapsAPILoader.load().then(() => {
      this.geoCoder = new google.maps.Geocoder;

      const autocomplete = new google.maps.places.Autocomplete(this.searchElementRef.nativeElement);
      autocomplete.addListener("place_changed", () => {
        this.ngZone.run(() => {

          const place: google.maps.places.PlaceResult = autocomplete.getPlace();

          if (place.geometry === undefined || place.geometry === null) {
            return;
          }

          this.lat = place.geometry.location.lat();
          this.lng = place.geometry.location.lng();
          this.zoom = 11;
          this.ciudadOutPut.emit(place.name.toString());
        });
      });
    });
  }

  irVisualizarInmueble(inmueble: Inmueble){
    this.router.navigateByUrl("/vistaInmueble", {state: {id: inmueble.id, inmueble: inmueble}});
  }

  obtenerUbicacionActual(){
    navigator.geolocation.getCurrentPosition(position =>{
      this.lat = position.coords.latitude;
      this.lng = position.coords.longitude;
      this.zoom = 11;
      this.filtradoPorGeolocalizacion();
    })
  }

  filtradoPorGeolocalizacion(){
    this.latlng.lat = this.lat;
    this.latlng.lng = this.lng;
    var geocoder = new google.maps.Geocoder;
    geocoder.geocode({'location': this.latlng},
    (results, status) => {
        if (status === google.maps.GeocoderStatus.OK) {
          if (results[1]) {
            console.log(results[1].formatted_address);
            console.log(results[1].address_components[2].long_name);
            this.ciudadOutPut.emit(results[1].address_components[2].long_name);
          }
        }
    });
  }
}

