import { NgModule,CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FiltrosComponent } from './filtros/filtros.component';
import { TarjetasComponent } from './tarjetas/tarjetas.component';
import { MapaComponent } from './mapa/mapa.component';
import { AgmCoreModule } from '@agm/core';
import { MatCardModule } from '@angular/material/card';
import { MatSelectModule } from '@angular/material/select';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { RouterModule, Routes } from '@angular/router';



@NgModule({
  declarations: [FiltrosComponent, TarjetasComponent, MapaComponent],
  imports: [
    CommonModule,
    FormsModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyAxGWtQXfOxu4wrfSwcBjaYW3q8_5ntYds',
      libraries: ["places"],
      apiVersion: 'quarterly',

    }),
    MatSelectModule,
    ReactiveFormsModule,
    MatInputModule,
    MatButtonModule,
    MatCardModule
  ],
  exports:[
    FiltrosComponent,
    MapaComponent,
    TarjetasComponent
  ]
})
export class ComponentesModule { }
