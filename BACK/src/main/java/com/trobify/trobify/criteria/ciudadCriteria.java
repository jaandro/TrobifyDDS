package com.trobify.trobify.criteria;

import com.trobify.trobify.clases.Inmueble;
import com.trobify.trobify.clases.Inmueble_;
import com.trobify.trobify.criteria.criteriaOperators.ICriteria;

import org.springframework.data.jpa.domain.Specification;

import io.github.jhipster.service.QueryService;

public class ciudadCriteria extends QueryService<Inmueble> implements ICriteria {

    @Override
    public Specification<Inmueble> meetCriteria(Specification<Inmueble> specifications, InmuebleCriteria criteria) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        if(criteria.getCiudad() != null){
            specifications = specifications.and(buildStringSpecification(criteria.getCiudad(), Inmueble_.ciudad));
        }
        return specifications;
    }
}
