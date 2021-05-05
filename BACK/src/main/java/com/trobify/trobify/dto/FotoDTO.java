package com.trobify.trobify.dto;

public class FotoDTO {

    private int id;
    private String foto;
    private InmuebleDTO inmueble;

    public InmuebleDTO getInmueble() {
        return inmueble;
    }
    public void setInmueble(InmuebleDTO inmueble) {
        this.inmueble = inmueble;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }

}
