import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddEditInmuebleComponent } from '../app/container/add-edit-inmueble/add-edit-inmueble.component'
import { PaginaBusquedaComponent } from '../app/container/pagina-busqueda/pagina-busqueda.component'
import { PaginaVisualizarInmuebleComponent } from '../app/container/pagina-visualizar-inmueble/pagina-visualizar-inmueble.component'
import { PaginaBienvenidaComponent } from './container/pagina-bienvenida/pagina-bienvenida.component';



const routes: Routes = [
  {
    path: '',
    redirectTo: 'vistaBienvenida',
    pathMatch: 'full',
  },
  {
    path: 'home',
    component: PaginaBusquedaComponent
  },
  {
    path: 'vistaInmueble',
    component: PaginaVisualizarInmuebleComponent
  },
  {
    path: 'addEditInmueble',
    component: AddEditInmuebleComponent
  },

  {
    path: 'vistaBienvenida',
    component: PaginaBienvenidaComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
