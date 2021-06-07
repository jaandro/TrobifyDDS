package com.trobify.trobify.criteria.criteriaOperators;

import com.trobify.trobify.clases.Inmueble;
import com.trobify.trobify.criteria.InmuebleCriteria;

import org.springframework.data.jpa.domain.Specification;

public interface ICriteria {
    public Specification<Inmueble> meetCriteria(Specification<Inmueble> specifications, InmuebleCriteria criteria);
}
