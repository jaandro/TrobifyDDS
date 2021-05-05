package com.trobify.trobify.clases;

import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TipoVivienda.class)
public abstract class TipoVivienda_ {

	public static volatile SingularAttribute<TipoVivienda, String> tipo;
	public static volatile SingularAttribute<TipoVivienda, Integer> id;
	public static volatile ListAttribute<TipoVivienda, Inmueble> inmuebles;

	public static final String TIPO = "tipo";
	public static final String ID = "id";
	public static final String INMUEBLES = "inmuebles";

}

