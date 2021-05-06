package com.trobify.trobify.servicios;


import java.util.List;
import java.util.function.Function;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import com.trobify.trobify.clases.InmuebleFabrica.Inmueble_;
import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import com.trobify.trobify.criteria.InmuebleCriteria;
import com.trobify.trobify.interfaces.InmuebleInterface;
import com.trobify.trobify.repositorios.InmuebleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import io.github.jhipster.service.QueryService;

@Service
public class InmuebleService extends QueryService<Inmueble> implements InmuebleInterface {

    @Autowired
    private InmuebleRepository inmuebleRep;

    public List<Inmueble> getInmueblesFiltrados(InmuebleCriteria inmuebleCriteria){
        final Specification<Inmueble> specification = createSpecification(inmuebleCriteria); 
        List<Inmueble> inmuebles = inmuebleRep.findAll(specification);
        return inmuebles;
    }

    private Specification<Inmueble> createSpecification(InmuebleCriteria criteria) {
        Specification<Inmueble> specification = Specification.where(null);
        if(criteria != null){
            specification = specificationCiudad(criteria, specification);
            specification = specificationSuperficie(criteria, specification);
            specification = specificationBanos(criteria, specification);
            specification = specificationHabitaciones(criteria, specification);
            specification = specificationServicios(criteria, specification);
        }
        return specification;
    }

    private Specification<Inmueble> specificationServicios(InmuebleCriteria criteria, Specification<Inmueble> specification) {
        if(criteria.getServicios() != null){
            specification = specification.and(buildSpecification(criteria.getServicios(), (Function<Root<Inmueble>, Expression<String>>) Inmueble_.servicios));
        }
        return specification;
    }

    private Specification<Inmueble> specificationHabitaciones(InmuebleCriteria criteria, Specification<Inmueble> specification) {
        if(criteria.getNumHabitaciones() != null){
            specification = specification.and(buildRangeSpecification(criteria.getNumHabitaciones(), Inmueble_.numHabitaciones));
        }
        return specification;
    }

    private Specification<Inmueble> specificationBanos(InmuebleCriteria criteria, Specification<Inmueble> specification) {
        if(criteria.getNumBanos() != null){
            specification = specification.and(buildRangeSpecification(criteria.getNumBanos(), Inmueble_.numBanos));
        }
        return specification;
    }

    private Specification<Inmueble> specificationSuperficie(InmuebleCriteria criteria, Specification<Inmueble> specification) {
        if(criteria.getSuperficie() != null){
            specification = specification.and(buildRangeSpecification(criteria.getSuperficie(), Inmueble_.superficie));
        }
        return specification;
    }

    private Specification<Inmueble> specificationCiudad(InmuebleCriteria criteria, Specification<Inmueble> specification) {
        if(criteria.getCiudad() != null){
            specification = specification.and(buildStringSpecification(criteria.getCiudad(), Inmueble_.ciudad));
        }
        return specification;
    }
    
}
