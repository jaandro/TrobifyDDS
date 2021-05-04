package com.trobify.trobify.criteria;

import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.StringFilter;

public class InmuebleCriteria {
    
    private StringFilter ciudad;
    private IntegerFilter precio;
    private IntegerFilter superficie;
    private IntegerFilter numBanos;
    private IntegerFilter numHabitaciones;
    private StringFilter servicios;
    
    public IntegerFilter getPrecio() {
        return precio;
    }

    public void setPrecio(IntegerFilter precio) {
        this.precio = precio;
    }

    public IntegerFilter getSuperficie() {
        return superficie;
    }

    public void setSuperficie(IntegerFilter superficie) {
        this.superficie = superficie;
    }

    public StringFilter getCiudad() {
        return ciudad;
    }

    public void setCiudad(StringFilter ciudad) {
        this.ciudad = ciudad;
    }

    public IntegerFilter getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(IntegerFilter numBanos) {
        this.numBanos = numBanos;
    }

    public IntegerFilter getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(IntegerFilter numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    public StringFilter getServicios() {
        return servicios;
    }
    public void setServicios(StringFilter servicios) {
        this.servicios = servicios;
    }
    @Override
    public String toString() {
        return "InmuebleCriteria [ciudad=" + ciudad + ", numBanos=" + numBanos + ", numHabitaciones=" + numHabitaciones
                + ", precio=" + precio + ", servicios=" + servicios + ", superficie=" + superficie + "]";
    }

}
