package com.trobify.trobify.servicios;

import com.trobify.trobify.clases.Inmueble;
import com.trobify.trobify.clases.TipoVivienda;
import com.trobify.trobify.repositorios.tipoViviendaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.github.jhipster.service.QueryService;

@Service
public class tipoViviendaService extends QueryService<Inmueble>{
    @Autowired
    private tipoViviendaRepository tiposRep;

    public TipoVivienda saveTipoVivienda(TipoVivienda tipos){
        return tiposRep.save(tipos);
    }
}