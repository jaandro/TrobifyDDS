package com.trobify.trobify.clases;

import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Foto.class)
public abstract class Foto_ {

	public static volatile SingularAttribute<Foto, String> foto;
	public static volatile SingularAttribute<Foto, Inmueble> inmueble;
	public static volatile SingularAttribute<Foto, Integer> id;

	public static final String FOTO = "foto";
	public static final String INMUEBLE = "inmueble";
	public static final String ID = "id";

}

