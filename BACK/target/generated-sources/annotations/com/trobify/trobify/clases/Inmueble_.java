package com.trobify.trobify.clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Inmueble.class)
public abstract class Inmueble_ {

	public static volatile SingularAttribute<Inmueble, String> descripcion;
	public static volatile SingularAttribute<Inmueble, String> latitud;
	public static volatile SingularAttribute<Inmueble, String> estado;
	public static volatile SingularAttribute<Inmueble, Integer> numBanos;
	public static volatile SingularAttribute<Inmueble, Double> consumoEnergia;
	public static volatile SingularAttribute<Inmueble, Integer> planta;
	public static volatile SingularAttribute<Inmueble, Integer> numHabitaciones;
	public static volatile SingularAttribute<Inmueble, Boolean> ascensor;
	public static volatile SingularAttribute<Inmueble, String> pais;
	public static volatile ListAttribute<Inmueble, Servicios> servicios;
	public static volatile SingularAttribute<Inmueble, String> longitud;
	public static volatile SingularAttribute<Inmueble, Integer> precio;
	public static volatile SingularAttribute<Inmueble, Integer> superficie;
	public static volatile SingularAttribute<Inmueble, String> ciudad;
	public static volatile ListAttribute<Inmueble, TipoVivienda> tipoViviendas;
	public static volatile SingularAttribute<Inmueble, Integer> id;
	public static volatile SingularAttribute<Inmueble, Boolean> amueblado;
	public static volatile ListAttribute<Inmueble, Foto> fotos;

	public static final String DESCRIPCION = "descripcion";
	public static final String LATITUD = "latitud";
	public static final String ESTADO = "estado";
	public static final String NUM_BANOS = "numBanos";
	public static final String CONSUMO_ENERGIA = "consumoEnergia";
	public static final String PLANTA = "planta";
	public static final String NUM_HABITACIONES = "numHabitaciones";
	public static final String ASCENSOR = "ascensor";
	public static final String PAIS = "pais";
	public static final String SERVICIOS = "servicios";
	public static final String LONGITUD = "longitud";
	public static final String PRECIO = "precio";
	public static final String SUPERFICIE = "superficie";
	public static final String CIUDAD = "ciudad";
	public static final String TIPO_VIVIENDAS = "tipoViviendas";
	public static final String ID = "id";
	public static final String AMUEBLADO = "amueblado";
	public static final String FOTOS = "fotos";

}

