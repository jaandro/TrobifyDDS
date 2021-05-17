package com.trobify.trobify.criteria;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.metamodel.SingularAttribute;

import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import com.trobify.trobify.clases.InmuebleFabrica.Inmueble_;
import com.trobify.trobify.criteria.criteriaOperators.ICriteria;
import com.trobify.trobify.dto.BusquedaDTO;

import org.springframework.data.jpa.domain.Specification;

import io.github.jhipster.service.QueryService;
import io.github.jhipster.service.filter.IntegerFilter;

public class precioCriteria extends QueryService<Inmueble> implements ICriteria {

    @Override
    public Specification<Inmueble> meetCriteria(Specification<Inmueble> specifications, InmuebleCriteria criteria) {
        if(criteria.getCiudad() != null){
            specifications = specifications.and(buildRangeSpecification(criteria.getSuperficie(), Inmueble_.superficie));
        }
        return specifications;
    }
}
