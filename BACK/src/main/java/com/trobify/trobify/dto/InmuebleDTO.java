package com.trobify.trobify.dto;

import java.util.Date;
import java.util.List;

public class InmuebleDTO {
    
    private int id;

    public int superficie;
    public String descripcion;
    public String latitud;
    public String longitud;
    public String ciudad;
    public String pais;
    public int numBanos;
    public int numHabitaciones;
    public String estado;
    public boolean ascensor;
    public boolean amueblado;
    public int planta;
    public Date fechaConstruccion;

    public int numCompaneros;
    public int precioHabitacion;

    public double precioMes;

    
    public double consumoEnergia;
    public int precio;

    public List<FotoDTO> fotos;
    private List<ServiciosDTO> servicios;
    private List<TipoViviendaDTO> tipoViviendas;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSuperficie() {
        return superficie;
    }
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getLatitud() {
        return latitud;
    }
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }
    public String getLongitud() {
        return longitud;
    }
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getNumBanos() {
        return numBanos;
    }
    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public boolean isAscensor() {
        return ascensor;
    }
    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }
    public boolean isAmueblado() {
        return amueblado;
    }
    public void setAmueblado(boolean amueblado) {
        this.amueblado = amueblado;
    }
    public int getPlanta() {
        return planta;
    }
    public void setPlanta(int planta) {
        this.planta = planta;
    }
    public double getConsumoEnergia() {
        return consumoEnergia;
    }
    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }
    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }
    public List<FotoDTO> getFotos() {
        return fotos;
    }
    public void setFotos(List<FotoDTO> fotos) {
        this.fotos = fotos;
    }
    public List<ServiciosDTO> getServicios() {
        return servicios;
    }
    public void setServicios(List<ServiciosDTO> servicios) {
        this.servicios = servicios;
    }
    public List<TipoViviendaDTO> getTipoViviendas() {
        return tipoViviendas;
    }
    public void setTipoViviendas(List<TipoViviendaDTO> tipoViviendas) {
        this.tipoViviendas = tipoViviendas;
    }

    
}
