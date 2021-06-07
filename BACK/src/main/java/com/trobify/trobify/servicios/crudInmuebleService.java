package com.trobify.trobify.servicios;

import java.util.List;

import com.trobify.trobify.clases.Foto;
import com.trobify.trobify.clases.Servicios;
import com.trobify.trobify.clases.TipoVivienda;
import com.trobify.trobify.clases.Inmueble;
import com.trobify.trobify.repositorios.crudInmuebleRepository;
import com.trobify.trobify.repositorios.fotosRepository;
import com.trobify.trobify.repositorios.serviciosInmuebleRepository;
import com.trobify.trobify.repositorios.tipoViviendaRepository;

import org.hibernate.annotations.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.github.jhipster.service.QueryService;

@Service
public class crudInmuebleService extends QueryService<Inmueble>{

    @Autowired
    private crudInmuebleRepository inmuebleRep;

    public Inmueble saveInmueble(Inmueble inmueble){
        return inmuebleRep.save(inmueble);
    }   

    public void deleteInmueble(int id){
        inmuebleRep.deleteById(id);
    }

}
