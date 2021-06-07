package com.trobify.trobify.clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Servicios.class)
public abstract class Servicios_ {

	public static volatile SingularAttribute<Servicios, String> servicio;
	public static volatile SingularAttribute<Servicios, Integer> id;
	public static volatile ListAttribute<Servicios, Inmueble> inmuebles;

	public static final String SERVICIO = "servicio";
	public static final String ID = "id";
	public static final String INMUEBLES = "inmuebles";

}

