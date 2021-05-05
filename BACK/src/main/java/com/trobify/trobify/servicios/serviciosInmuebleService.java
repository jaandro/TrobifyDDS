package com.trobify.trobify.servicios;

import com.trobify.trobify.clases.Servicios;
import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import com.trobify.trobify.repositorios.serviciosInmuebleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.github.jhipster.service.QueryService;

@Service
public class serviciosInmuebleService extends QueryService<Inmueble>{     
    @Autowired
    private serviciosInmuebleRepository serviciosRep;

    public Servicios saveServicios(Servicios servicios){
        return serviciosRep.save(servicios);
    }
}
