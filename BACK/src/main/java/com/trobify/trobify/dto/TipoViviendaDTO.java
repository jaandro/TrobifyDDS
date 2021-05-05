package com.trobify.trobify.dto;

import java.util.List;

public class TipoViviendaDTO {

    private int id;
    private String tipo;
    private List<InmuebleDTO> inmuebles;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public List<InmuebleDTO> getInmuebles() {
        return inmuebles;
    }
    public void setInmuebles(List<InmuebleDTO> inmuebles) {
        this.inmuebles = inmuebles;
    }
    
}
