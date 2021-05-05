package com.trobify.trobify.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;

@Entity
@Table(name = "foto")
public class Foto {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String foto;

    @ManyToOne
    @JoinColumn(name = "idInmueble", nullable = false, updatable = false)
    @JsonIgnoreProperties("fotos")
    private Inmueble inmueble;

    public Foto() {
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



    public Inmueble getInmueble() {
        return inmueble;
    }



    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    
}
