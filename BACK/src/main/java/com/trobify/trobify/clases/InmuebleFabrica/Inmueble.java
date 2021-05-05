package com.trobify.trobify.clases.InmuebleFabrica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.trobify.trobify.clases.Foto;
import com.trobify.trobify.clases.Servicios;
import com.trobify.trobify.clases.TipoVivienda;
import com.trobify.trobify.dto.InmuebleDTO;

import org.hibernate.dialect.Ingres10Dialect;

@Entity
@Table(name = "inmueble")
public abstract class Inmueble {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    protected int superficie;
    @Column
    protected String descripcion;
    @Column
    protected String latitud;
    @Column
    protected String longitud;
    @Column
    protected String ciudad;
    @Column
    protected String pais;
    @Column
    protected int numBanos;
    @Column
    protected int numHabitaciones;
    @Column
    protected String estado;
    @Column
    protected boolean ascensor;
    @Column 
    protected boolean amueblado;
    @Column
    protected int planta;
    @Column(nullable = true)
    protected Date fechaConstruccion;

    @OneToMany(mappedBy = "inmueble", cascade = CascadeType.ALL)
    public List<Foto> fotos;

    @JoinTable(
        name = "inmueble_servicios",
        joinColumns = @JoinColumn(name = "idInmueble", nullable = false),
        inverseJoinColumns = @JoinColumn(name="idServicio", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("inmuebles")
    private List<Servicios> servicios;

    @JoinTable(
        name = "inmueble_tipo",
        joinColumns = @JoinColumn(name = "idInmueble", nullable = false),
        inverseJoinColumns = @JoinColumn(name="idTipo", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("inmuebles")
    private List<TipoVivienda> tipoViviendas;
   

    public Inmueble(InmuebleDTO inmuebleDTO) {
        this.superficie = inmuebleDTO.superficie;
        this.descripcion = inmuebleDTO.descripcion;
        this.latitud = inmuebleDTO.latitud;
        this.longitud = inmuebleDTO.longitud;
        this.ciudad = inmuebleDTO.ciudad;
        this.pais = inmuebleDTO.pais;
        this.numBanos = inmuebleDTO.numBanos;
        this.numHabitaciones = inmuebleDTO.numHabitaciones;
        this.estado = inmuebleDTO.estado;
        this.ascensor = inmuebleDTO.ascensor;
        this.amueblado = inmuebleDTO.amueblado;
        this.fechaConstruccion = inmuebleDTO.fechaConstruccion;
    }

    public void addServicio(Servicios servicio){
        if(this.servicios == null){
            this.servicios = new ArrayList<>();
        }
        
        this.servicios.add(servicio);
    }

    public void addTipo(TipoVivienda tipo){
        if(this.tipoViviendas == null){
            this.tipoViviendas = new ArrayList<>();
        }
        
        this.tipoViviendas.add(tipo);
    }

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

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }

    public List<TipoVivienda> getTipoViviendas() {
        return tipoViviendas;
    }

    public void setTipoViviendas(List<TipoVivienda> tipoViviendas) {
        this.tipoViviendas = tipoViviendas;
    }

    @Override
    public String toString() {
        return "Inmueble [amueblado=" + amueblado + ", ascensor=" + ascensor + ", ciudad=" + ciudad
                + ", descripcion=" + descripcion + ", estado=" + estado
                + ", fechaConstruccion=" + fechaConstruccion + ", fotos=" + fotos + ", id=" + id + ", latitud="
                + latitud + ", longitud=" + longitud + ", numBanos=" + numBanos + ", numHabitaciones=" + numHabitaciones
                + ", pais=" + pais + ", planta=" + planta +  ", servicios=" + servicios
                + ", superficie=" + superficie + ", tipoViviendas=" + tipoViviendas + "]";
    }
   
}
