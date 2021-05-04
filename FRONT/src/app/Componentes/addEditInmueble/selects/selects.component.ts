import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { IDropdownSettings } from 'ng-multiselect-dropdown';

@Component({
  selector: 'app-selects',
  templateUrl: './selects.component.html',
  styleUrls: ['./selects.component.css']
})
export class SelectsComponent implements OnInit {

  @Output() tipoOutput = new EventEmitter<any>();
  @Output() contratoOutput = new EventEmitter<any>();
  @Output() precioOutput = new EventEmitter<any>();
  @Output() superficieOutput = new EventEmitter<any>();
  @Output() habitacionesOutput = new EventEmitter<any>();
  @Output() banosOutput = new EventEmitter<any>();

  constructor(/*private dropSettings: IDropdownSettings*/) { }

  viviendasList = [
    { item_id: 1, item_text: 'Apartamento' },
    { item_id: 2, item_text: 'Ático' },
    { item_id: 3, item_text: 'Dúplex' },
    { item_id: 4, item_text: 'Loft' },
    { item_id: 5, item_text: 'Planta baja' },
    { item_id: 6, item_text: 'Estudio' },
    { item_id: 7, item_text: 'Chalet' },
    { item_id: 8, item_text: 'Casa adosada' },
    { item_id: 9, item_text: 'Finca rústica' },
  ];
  selectedViviendas: any[] = [];

  contratosList = [
    { item_id: 1, item_text: 'Venta' },
    { item_id: 2, item_text: 'Alquiler' },
    { item_id: 3, item_text: 'Compartir' },
    { item_id: 4, item_text: 'Vacacional' },
  ];
  selectedContratos: any[] = [];

  selectSettings: IDropdownSettings = {
    singleSelection: false,
    idField: 'item_id',
    textField: 'item_text',
    itemsShowLimit: 4,
    enableCheckAll: false,
    allowSearchFilter: false
  };

  ngOnInit() {
  }

  onViviendasSelect(item: any) {
    this.selectedViviendas.push(item.item_text)
    this.tipoOutput.emit(this.selectedViviendas)
  }

  onViviendasDeSelect(item: any) {
    var index = this.selectedViviendas.indexOf(item.item_text)
    this.selectedViviendas.splice(index, 1)
    this.tipoOutput.emit(this.selectedViviendas)
  }

  onContratosSelect(item: any) {
    this.selectedContratos.push(item.item_text)
    this.contratoOutput.emit(this.selectedContratos)
  }

  onContratosDeSelect(item: any) {
    var index = this.selectedContratos.indexOf(item.item_text)
    this.selectedContratos.splice(index, 1)
    this.contratoOutput.emit(this.selectedContratos)
  }

  precio(event: any) {
    this.precioOutput.emit(event.target.value)
  }

  superficie(event: any) {
    this.superficieOutput.emit(event.target.value)
  }

  habitaciones(event: any) {
    this.habitacionesOutput.emit(event.target.value)
  }

  banos(event: any) {
    this.banosOutput.emit(event.target.value)
  }

}
