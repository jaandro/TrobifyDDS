import { MapsAPILoader } from '@agm/core';
import { ElementRef } from '@angular/core';
import { NgZone } from '@angular/core';
import { ViewChild } from '@angular/core';
import { Component, OnChanges, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {} from '@angular/google-maps';

@Component({
  selector: 'app-pagina-bienvenida',
  templateUrl: './pagina-bienvenida.component.html',
  styleUrls: ['./pagina-bienvenida.component.css']
})
export class PaginaBienvenidaComponent implements OnInit {

  constructor(private router: Router,private ngZone: NgZone,private mapsAPILoader: MapsAPILoader) { }

  geoCoder!: google.maps.Geocoder;
  ciudad!: String;
  lat!: number;
  lng!: number;

  @ViewChild('search')
  public searchElementRef!: ElementRef;

  ngOnInit(): void {

    }


  irPaginaBusqueda(){
    this.router.navigateByUrl("/home", {state:{ciudad: this.ciudad, lat: this.lat, lng:this.lng}});
  }

  busqueda(){
    this.mapsAPILoader.load().then(() => {
      this.geoCoder = new google.maps.Geocoder;

      const autocomplete = new google.maps.places.Autocomplete(this.searchElementRef.nativeElement);
      autocomplete.addListener("place_changed", () => {
        this.ngZone.run(() => {
          const place: google.maps.places.PlaceResult = autocomplete.getPlace();
          if (place.geometry === undefined || place.geometry === null) {
            return;
          }
          this.ciudad =place.name.toString();
          this.lat = place.geometry.location.lat();
          this.lng = place.geometry.location.lng();
        });
      });
    });
}
}
