package com.trobify.trobify.clases.InmuebleFabrica;

import com.trobify.trobify.dto.InmuebleDTO;

public abstract class Creador{
    public abstract Inmueble crearInmueble(String tipo, InmuebleDTO inmuebleDTO);
}