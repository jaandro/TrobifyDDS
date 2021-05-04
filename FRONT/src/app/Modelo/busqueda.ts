export interface Busqueda {
    ciudad: string;
    precioDesde: number;
    precioHasta: number;
    superficieDesde: number;
    superficieHasta: number;
    numeroBanosMinimos: number;
    numeroBanosMaximos: number;
    numeroHabitacionesMinimas: number;
    numeroHabitacionesMaximas: number;
    //tipoVivienda: string [];
    servicios?: string [];
    alquilar: boolean;
    comprar: boolean;
}
