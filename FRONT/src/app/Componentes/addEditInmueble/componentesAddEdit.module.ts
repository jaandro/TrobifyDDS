import { NgModule,CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatSelectModule } from '@angular/material/select';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { FileUploadModule} from 'ng2-file-upload';
import { ImgComponent } from '../addEditInmueble/img/img.component';
import { SelectsComponent } from '../addEditInmueble/selects/selects.component';
import { TiposComponent } from '../addEditInmueble/tipos/tipos.component';
import { NgImageSliderModule } from 'ng-image-slider';
import { NgMultiSelectDropDownModule } from 'ng-multiselect-dropdown';
import { MatGridListModule } from '@angular/material/grid-list';
import { AddMapaComponent } from './add-mapa/add-mapa.component';
import { AgmCoreModule } from '@agm/core';
import {MatButtonToggleModule} from '@angular/material/button-toggle';

import { CloudinaryModule, CloudinaryConfiguration } from '@cloudinary/angular-5.x';
import { Cloudinary } from 'cloudinary-core';

@NgModule({
  declarations: [ImgComponent, SelectsComponent, TiposComponent, AddMapaComponent],
  imports: [
    CommonModule,
    MatSelectModule,
    MatInputModule,
    MatButtonModule,
    MatCardModule,
    FileUploadModule,
    NgImageSliderModule,
    NgMultiSelectDropDownModule,
    MatGridListModule,
    MatButtonToggleModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyAxGWtQXfOxu4wrfSwcBjaYW3q8_5ntYds',
      libraries: ["places"],
      apiVersion: 'quarterly',
    }),

    CloudinaryModule.forRoot({Cloudinary}, { cloud_name: 'dxxvcl5fe' } as CloudinaryConfiguration),
  ],
  exports:[
    ImgComponent,
    SelectsComponent,
    TiposComponent,
    AddMapaComponent
  ]
})
export class ComponentesAddEditModule { }
