package com.trobify.trobify.clases.InmuebleFabrica;

import com.trobify.trobify.dto.InmuebleDTO;

public interface Creador{
    public abstract Inmueble crearInmueble(String tipo, InmuebleDTO inmuebleDTO);
}