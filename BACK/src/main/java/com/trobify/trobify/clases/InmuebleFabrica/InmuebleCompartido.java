package com.trobify.trobify.clases.InmuebleFabrica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.trobify.trobify.dto.InmuebleDTO;

public class InmuebleCompartido extends Inmueble {

    @Column
    public int numCompaneros;
    @Column
    public double precioHabitacion;

    public InmuebleCompartido(InmuebleDTO inmuebleDTO) {
        // super(inmuebleDTO);
        this.numCompaneros = inmuebleDTO.numCompaneros;
        this.precioHabitacion = inmuebleDTO.precioHabitacion;
    }

    public int getNumCompaneros() {
        return numCompaneros;
    }

    public void setNumCompaneros(int numCompaneros) {
        this.numCompaneros = numCompaneros;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    // @Override
    // public void hola() {
    //     System.out.println("Compartido");
        
    // }

    
}
