import { Foto } from './foto';
export interface Inmueble {
    amueblado: Boolean
    ascensor: Boolean
    ciudad: String
    consumoEnergia: number
    descripcion: String
    estado: String
    fechaConstruccion: Date
    fotos: Foto[]
    id: number
    latitud: number
    longitud: number
    numBanos: number
    numHabitaciones: number
    pais: String
    planta: number
    precio: number
    servicios: any[]
    superficie: number
    tipoViviendas: any[]
}
