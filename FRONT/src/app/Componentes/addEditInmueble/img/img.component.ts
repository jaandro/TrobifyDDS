import { Imagen } from './../../../Modelo/imagen';
import { Component, OnInit, ViewChild, ElementRef, Output, EventEmitter } from '@angular/core';
@Component({
  selector: 'app-img',
  templateUrl: './img.component.html',
  styleUrls: ['./img.component.css']
})
export class ImgComponent implements OnInit {

  @Output() imagenOutput = new EventEmitter<any>()

  @ViewChild('imagenInputFile', {static: false}) imagenFile!: ElementRef

  public imagen!: File;
  public imagenMin: Array<Imagen> = []

  constructor(){}

  ngOnInit(): void {
  }

  onFileChange(event: any) {
    this.imagen = event.target.files[0]
    const fileReader = new FileReader()
    fileReader.onload = (evento: any) => {
      var dinamic: Imagen =
        {
          image: evento.target.result,
          thumbImage: evento.target.result,
          alt: '',
          title: ''
        }
      this.imagenMin.unshift(dinamic)
      console.log(this.imagenMin)
    }
    fileReader.readAsDataURL(this.imagen)
    this.imagenOutput.emit(this.imagen.name)
  }

}
