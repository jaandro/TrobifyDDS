import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tipos',
  templateUrl: './tipos.component.html',
  styleUrls: ['./tipos.component.css']
})
export class TiposComponent implements OnInit {

  textArea!: string;
  hola: any


  constructor() { }

  ngOnInit(): void {
  }

  writting(event: any) {
    console.log("hola11")
    this.textArea = event

    console.log(event)
  }

  servicios1(asdf: any) {
    console.log(asdf)
  }

  servicios21(asdf: any) {
    console.log(asdf)
  }

  servicios22(asdf: any) {
    console.log(asdf)
  }

  servicios23(asdf: any) {
    console.log(asdf)
  }

  servicios31(asdf: any) {
    console.log(asdf)
  }

  servicios32(asdf: any) {
    console.log(asdf)
  }

}
