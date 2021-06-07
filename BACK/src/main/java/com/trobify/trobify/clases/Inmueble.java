package com.trobify.trobify.clases;

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

@Entity
@Table(name = "inmueble")
public class Inmueble {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int superficie;
    @Column
    private String descripcion;
    @Column
    private String latitud;
    @Column
    private String longitud;
    @Column
    private String ciudad;
    @Column
    private String pais;
    @Column
    private int precio;
    @Column
    private int numBanos;
    @Column
    private int numHabitaciones;
    @Column
    private String estado;
    @Column
    private boolean ascensor;
    @Column 
    private boolean amueblado;
    @Column
    private int planta;
    @Column(nullable = true)
    private double consumoEnergia;
    // @Column(nullable = true)
    // private Date fechaConstruccion;

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

    public Inmueble() {
    }

    public Inmueble(int superficie, String descripcion, String latitud, String longitud, String ciudad,
            String pais, int precio, int numBanos, int numHabitaciones, String estado, boolean ascensor,
            boolean amueblado, int planta, double consumoEnergia, Date fechaConstruccion, List<Foto> fotos,
            List<Servicios> servicios, List<TipoVivienda> tipoViviendas) {
        this.superficie = superficie;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.ciudad = ciudad;
        this.pais = pais;
        this.precio = precio;
        this.numBanos = numBanos;
        this.numHabitaciones = numHabitaciones;
        this.estado = estado;
        this.ascensor = ascensor;
        this.amueblado = amueblado;
        this.planta = planta;
        this.consumoEnergia = consumoEnergia;
        // this.fechaConstruccion = fechaConstruccion;
        this.fotos = fotos;
        this.servicios = servicios;
        this.tipoViviendas = tipoViviendas;
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

    // public Date getFechaConstruccion() {
    //     return fechaConstruccion;
    // }

    // public void setFechaConstruccion(Date fechaConstruccion) {
    //     this.fechaConstruccion = fechaConstruccion;
    // }

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
                + ", consumoEnergia=" + consumoEnergia + ", descripcion=" + descripcion + ", estado=" + estado
                +  ", fotos=" + fotos + ", id=" + id + ", latitud="
                + latitud + ", longitud=" + longitud + ", numBanos=" + numBanos + ", numHabitaciones=" + numHabitaciones
                + ", pais=" + pais + ", planta=" + planta + ", precio=" + precio + ", servicios=" + servicios
                + ", superficie=" + superficie + ", tipoViviendas=" + tipoViviendas + "]";
    }

    
   
}
