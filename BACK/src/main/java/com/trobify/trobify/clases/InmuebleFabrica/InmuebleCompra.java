package com.trobify.trobify.clases.InmuebleFabrica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.trobify.trobify.dto.InmuebleDTO;

public class InmuebleCompra extends Inmueble {

    @Column
    public double consumoEnergia;
    @Column
    public double precio;

    public InmuebleCompra(InmuebleDTO inmuebleDTO) {
    //     // super(inmuebleDTO);
        this.consumoEnergia = inmuebleDTO.consumoEnergia;
        this.precio = inmuebleDTO.precio;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // @Override
    // public void hola() {
    //     System.out.println("Compra");
        
    // }
    
}
