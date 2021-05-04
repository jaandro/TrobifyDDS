package com.trobify.trobify.dto;

import java.util.Arrays;
import java.util.List;

public class BusquedaDTO {

    private String ciudad;
    private Integer precioDesde;
    private Integer precioHasta;
    private Integer superficieDesde;
    private Integer superficieHasta;
    private Integer numeroBanosMinimos;
    private Integer numeroBanosMaximos;
    private Integer numeroHabitacionesMinimas;
    private Integer numeroHabitacionesMaximas;
    private String [] servicios; 
    // private Boolean alquilar;
    // private Boolean comprar;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getPrecioDesde() {
        return precioDesde;
    }

    public void setPrecioDesde(Integer precioDesde) {
        this.precioDesde = precioDesde;
    }

    public Integer getPrecioHasta() {
        return precioHasta;
    }

    public void setPrecioHasta(Integer precioHasta) {
        this.precioHasta = precioHasta;
    }

    public Integer getSuperficieDesde() {
        return superficieDesde;
    }

    public void setSuperficieDesde(Integer superficieDesde) {
        this.superficieDesde = superficieDesde;
    }

    public Integer getSuperficieHasta() {
        return superficieHasta;
    }

    public void setSuperficieHasta(Integer superficieHasta) {
        this.superficieHasta = superficieHasta;
    }

    public Integer getNumeroBanosMinimos() {
        return numeroBanosMinimos;
    }

    public void setNumeroBanosMinimos(Integer numeroBanosMinimos) {
        this.numeroBanosMinimos = numeroBanosMinimos;
    }

    public Integer getNumeroBanosMaximos() {
        return numeroBanosMaximos;
    }

    public void setNumeroBanosMaximos(Integer numeroBanosMaximos) {
        this.numeroBanosMaximos = numeroBanosMaximos;
    }

    public Integer getNumeroHabitacionesMinimas() {
        return numeroHabitacionesMinimas;
    }

    public void setNumeroHabitacionesMinimas(Integer numeroHabitacionesMinimas) {
        this.numeroHabitacionesMinimas = numeroHabitacionesMinimas;
    }

    public Integer getNumeroHabitacionesMaximas() {
        return numeroHabitacionesMaximas;
    }

    public void setNumeroHabitacionesMaximas(Integer numeroHabitacionesMaximas) {
        this.numeroHabitacionesMaximas = numeroHabitacionesMaximas;
    }

    public List<String> getServicios() {
        return Arrays.asList(servicios);
    }

    public void setServicios(String[] servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "BusquedaDTO [ciudad=" + ciudad + ", numeroBanosMaximos=" + numeroBanosMaximos + ", numeroBanosMinimos="
                + numeroBanosMinimos + ", numeroHabitacionesMaximas=" + numeroHabitacionesMaximas
                + ", numeroHabitacionesMinimas=" + numeroHabitacionesMinimas + ", precioDesde=" + precioDesde
                + ", precioHasta=" + precioHasta + ", servicios=" + servicios + ", superficieDesde=" + superficieDesde
                + ", superficieHasta=" + superficieHasta + "]";
    }

}
