import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { FormsModule} from '@angular/forms'
import { ServiceService } from '../app/service/service.service'
import { HttpClientModule} from '@angular/common/http'
import { ComponentesModule } from './Componentes/PaginaBusqueda/componentes.module';
import { ComponentesAddEditModule } from './Componentes/addEditInmueble/componentesAddEdit.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PaginaBusquedaComponent } from './container/pagina-busqueda/pagina-busqueda.component';
import { MatCardModule } from '@angular/material/card';
import { PaginaVisualizarInmuebleComponent } from './container/pagina-visualizar-inmueble/pagina-visualizar-inmueble.component';
import { AddEditInmuebleComponent } from './container/add-edit-inmueble/add-edit-inmueble.component';
import { AgmCoreModule } from '@agm/core';

// import { CloudinaryModule, CloudinaryConfiguration } from '@cloudinary/angular-5.x';
// import { Cloudinary } from 'cloudinary-core';

import {MatButtonModule} from '@angular/material/button';
import { NgImageSliderModule } from 'ng-image-slider';
import { MatGridListModule } from '@angular/material/grid-list';
import { PaginaBienvenidaComponent } from './container/pagina-bienvenida/pagina-bienvenida.component';

@NgModule({
  declarations: [
    AppComponent,
    PaginaBusquedaComponent,

    PaginaVisualizarInmuebleComponent,
    AddEditInmuebleComponent,
    PaginaBienvenidaComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ComponentesModule,
    ComponentesAddEditModule,
    NgbModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatButtonModule,
    NgImageSliderModule,
    MatGridListModule,
    AgmCoreModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
