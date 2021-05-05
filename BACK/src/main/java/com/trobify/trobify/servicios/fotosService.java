package com.trobify.trobify.servicios;

import java.util.List;

import com.trobify.trobify.clases.Foto;
import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import com.trobify.trobify.repositorios.fotosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.jhipster.service.QueryService;

@Service
public class fotosService extends QueryService<Foto>{
    @Autowired
    private fotosRepository fotosRep;

    public Foto saveFotos(Foto foto){
        return fotosRep.save(foto);
    }
}

