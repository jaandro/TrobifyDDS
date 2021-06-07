package com.trobify.trobify.clases.InmuebleFabrica;

import com.trobify.trobify.dto.InmuebleDTO;

public class CreadorInmueble implements Creador {

    public static Inmueble crearInmueble(String tipo, InmuebleDTO inmuebleDTO) {
        if(tipo.equals("venta")){
            return new InmuebleCompra(inmuebleDTO);

        } else if(tipo.equals("alquiler")){
            return new InmbuebleAlquiler(inmuebleDTO);
            
        } else if(tipo.equals("compartido")){
            return new InmuebleCompartido(inmuebleDTO);
        }
        return null;
    }
    
}
