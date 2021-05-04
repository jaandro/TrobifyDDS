import { Component, OnInit, ViewChild, ElementRef, NgZone, Output, EventEmitter } from '@angular/core';

import { MapsAPILoader } from '@agm/core';
import {} from '@angular/google-maps';

@Component({
  selector: 'app-add-mapa',
  templateUrl: './add-mapa.component.html',
  styleUrls: ['./add-mapa.component.css']
})
export class AddMapaComponent implements OnInit {

  @Output() coordenadasOutput = new EventEmitter<any>();

  map!: google.maps.Map
  lat: number = 40.463667;
  geoCoder!: google.maps.Geocoder;
  lng: number = -3.74922;
  coor = {
    myLat!: 0,
    myLng!: 0
  }
  zoom: number = 6;

  @ViewChild('search')
  public searchElementRef!: ElementRef;

  constructor(private mapsAPILoader: MapsAPILoader, private ngZone: NgZone) { }

  ngOnInit(): void {
  }

  mapReady(map: google.maps.Map) {
    console.log("hola")
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
          this.zoom = 16;
        });
      });
    });

    this.map = map;
        this.map.addListener('click', (e: google.maps.MouseEvent) => {
            console.log(e.latLng.lat(), e.latLng.lng());
            this.coor.myLat = e.latLng.lat();
            this.coor.myLng = e.latLng.lng();
            this.coordenadasOutput.emit(this.coor)
        });
  }

}
