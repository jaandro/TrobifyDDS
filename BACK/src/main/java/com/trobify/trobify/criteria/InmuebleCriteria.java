package com.trobify.trobify.criteria;

import com.trobify.trobify.controladores.InmuebleController;
import com.trobify.trobify.dto.BusquedaDTO;

import org.apache.commons.lang3.StringUtils;

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

    public void filtroHabitaciones(BusquedaDTO dto, InmuebleController inmuebleController) {
        if(dto.getNumeroHabitacionesMinimas() != null || dto.getNumeroHabitacionesMaximas() != null) {
            IntegerFilter filter = new IntegerFilter();
            filtroHabitacionesMinimas(dto, filter);
            filtroHabitacionesMaximas(dto, filter);
        }
    }

    public void filtroHabitacionesMaximas(BusquedaDTO dto, IntegerFilter filter) {
        if(dto.getNumeroHabitacionesMaximas()!=null){
            filter.setLessThanOrEqual(dto.getNumeroHabitacionesMaximas());
            setNumHabitaciones(filter);
        }
    }

    public void filtroHabitacionesMinimas(BusquedaDTO dto, IntegerFilter filter) {
        if(dto.getNumeroHabitacionesMinimas()!=null){
            filter.setGreaterThanOrEqual(dto.getNumeroHabitacionesMinimas());
            setNumHabitaciones(filter);
        }
    }

    public void filtroBanos(BusquedaDTO dto, InmuebleController inmuebleController) {
        if(dto.getNumeroBanosMinimos() != null || dto.getNumeroBanosMaximos() != null) {
            IntegerFilter filter = new IntegerFilter();
            filtroBanosMinimos(dto, filter);
            filtrosBanosMaximo(dto, filter);
        }
    }

    public void filtrosBanosMaximo(BusquedaDTO dto, IntegerFilter filter) {
        if(dto.getNumeroBanosMaximos()!=null){
            filter.setLessThanOrEqual(dto.getNumeroBanosMaximos());
            setNumBanos(filter);
        }
    }

    public void filtroBanosMinimos(BusquedaDTO dto, IntegerFilter filter) {
        if(dto.getNumeroBanosMinimos()!=null){
            filter.setGreaterThanOrEqual(dto.getNumeroBanosMinimos());
            setNumBanos(filter);
        }
    }

    public void filtroSuperficie(BusquedaDTO dto, InmuebleController inmuebleController) {
        if(dto.getSuperficieDesde() != null || dto.getSuperficieHasta() != null) {
            IntegerFilter filter = new IntegerFilter();
            filtroSuperficieDesde(dto, filter);
            filtroSuperficieHasta(dto, filter);
        }
    }

    public void filtroSuperficieHasta(BusquedaDTO dto, IntegerFilter filter) {
        if(dto.getSuperficieHasta()!=null){
            filter.setLessThanOrEqual(dto.getSuperficieHasta());
            setSuperficie(filter);
        }
    }

    public void filtroSuperficieDesde(BusquedaDTO dto, IntegerFilter filter) {
        if(dto.getSuperficieDesde()!=null){
            filter.setGreaterThanOrEqual(dto.getSuperficieDesde());
            setSuperficie(filter);
        }
    }

    public void filtroPrecio(BusquedaDTO dto, InmuebleController inmuebleController) {
        if(dto.getPrecioDesde() != null || dto.getPrecioHasta() != null) {
            IntegerFilter filter = new IntegerFilter();
            filtroPrecioDesde(dto, filter);
            filtroPrecioHasta(dto, filter);
        }
    }

    public void filtroPrecioHasta(BusquedaDTO dto, IntegerFilter filter) {
        if(dto.getPrecioHasta()!=null){
            filter.setLessThanOrEqual(dto.getPrecioHasta());
            setPrecio(filter);
        }
    }

    public void filtroPrecioDesde(BusquedaDTO dto, IntegerFilter filter) {
        if(dto.getPrecioDesde()!=null){
            filter.setGreaterThanOrEqual(dto.getPrecioDesde());
            setPrecio(filter);
        }
    }

    public void filtroCiudad(BusquedaDTO dto) {
        if(!StringUtils.isBlank(dto.getCiudad())) {
            StringFilter filter = new StringFilter();
            filter.setEquals(dto.getCiudad());
            setCiudad(filter);
        }
    }

}
