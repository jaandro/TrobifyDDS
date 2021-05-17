package com.trobify.trobify.clases.InmuebleFabrica;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.trobify.trobify.dto.InmuebleDTO;

public class InmbuebleAlquiler extends Inmueble {

    @Column
    public double precioMes;

    public InmbuebleAlquiler(InmuebleDTO inmuebleDTO) {
        // super(inmuebleDTO);
        this.precioMes = inmuebleDTO.precioMes;
    }

    public double getPrecioMes() {
        return precioMes;
    }

    public void setPrecioMes(double precioMes) {
        this.precioMes = precioMes;
    }

    // @Override
    // public void hola() {
    //     System.out.println("Alquiler");
        
    // }
    
    
}
