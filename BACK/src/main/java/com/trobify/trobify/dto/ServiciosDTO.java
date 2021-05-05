package com.trobify.trobify.dto;

import java.util.List;

public class ServiciosDTO {
    private int id;
    private String servicio;
    private List<InmuebleDTO> inmuebles;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public List<InmuebleDTO> getInmuebles() {
        return inmuebles;
    }
    public void setInmuebles(List<InmuebleDTO> inmuebles) {
        this.inmuebles = inmuebles;
    }
}
