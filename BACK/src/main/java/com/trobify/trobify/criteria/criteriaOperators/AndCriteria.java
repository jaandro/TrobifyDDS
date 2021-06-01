package com.trobify.trobify.criteria.criteriaOperators;

import java.util.List;

import com.trobify.trobify.clases.InmuebleFabrica.CreadorInmueble;
import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import com.trobify.trobify.criteria.InmuebleCriteria;
import org.springframework.data.jpa.domain.Specification;

public class AndCriteria implements ICriteria {

    private List<ICriteria> criterias;

    public AndCriteria(List<ICriteria> criterias) {
        this.criterias = criterias;
    }
    
    @Override
    public Specification<Inmueble> meetCriteria(Specification<Inmueble> specifications, InmuebleCriteria criteria) {
        for(ICriteria nameClass : criterias){
            specifications = nameClass.meetCriteria(specifications, criteria);
        }
        return specifications;
    }
}
