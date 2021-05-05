package com.trobify.trobify.interfaces;

import java.util.List;

import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import com.trobify.trobify.criteria.InmuebleCriteria;

public interface InmuebleInterface {

    public List<Inmueble> getInmueblesFiltrados(InmuebleCriteria inmuebleCriteria);
    
}
