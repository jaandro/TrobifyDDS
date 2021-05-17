package com.trobify.trobify.servicios;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import com.trobify.trobify.clases.InmuebleFabrica.Inmueble_;
import com.trobify.trobify.clases.InmuebleFabrica.Creador;
import com.trobify.trobify.clases.InmuebleFabrica.CreadorInmueble;
import com.trobify.trobify.clases.InmuebleFabrica.InmbuebleAlquiler;
import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import com.trobify.trobify.clases.InmuebleFabrica.InmuebleCompra;
import com.trobify.trobify.criteria.InmuebleCriteria;
import com.trobify.trobify.criteria.precioCriteria;
import com.trobify.trobify.criteria.criteriaOperators.AndCriteria;
import com.trobify.trobify.criteria.criteriaOperators.ICriteria;
import com.trobify.trobify.dto.BusquedaDTO;
import com.trobify.trobify.dto.InmuebleDTO;
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

    public List<Inmueble> getInmueblesFiltrados(/*InmuebleCriteria inmuebleCriteria*/ BusquedaDTO busquedaDTO){
        //final Specification<Inmueble> specification = createSpecification(inmuebleCriteria); 
        // List<Inmueble> inmuebles = inmuebleRep.findAll(specification);
        
        //cogemos todos los inmuebles de la bda
        List<Inmueble> inmuebles = inmuebleRep.findAll();
        // System.out.println(inmuebles.toString());

        //creamos neestras instancias de criteria
        ICriteria precioCriteria = new precioCriteria();

        //añadimos las instancias de criteria en una list
        List<ICriteria> criterias = new ArrayList<ICriteria>();
        criterias.add(precioCriteria);

        //se crea un operación and con la lista de criterios a filtrar
        ICriteria filtros = new AndCriteria(criterias);

        InmuebleCriteria criteria = new InmuebleCriteria();
        Specification<Inmueble> specification = Specification.where(null);

        //recuperamos la lista de inmuebles filtrada segun los parametros de busqueda
        Specification<Inmueble> filtrados = filtros.meetCriteria(specification, criteria);
        List<Inmueble> inmueblesFiltrados = inmuebleRep.findAll(filtrados);

        
        InmuebleDTO dto = new InmuebleDTO();
		Inmueble inmV = CreadorInmueble.crearInmueble("venta", dto);
		InmbuebleAlquiler inmA = new InmbuebleAlquiler(dto);
		Inmueble inmC = CreadorInmueble.crearInmueble("compartido", dto);

		// inmV.hola();
		// inmA.hola();
		// inmC.hola();

        // double pm = inmV.g

        // System.out.println(filtrados.toString());
        return inmuebles;
    }

    private Specification<Inmueble> createSpecification(InmuebleCriteria criteria) { // como si hicieramos una query
        Specification<Inmueble> specification = Specification.where(null);
        if(criteria != null){
            if(criteria.getCiudad() != null){
                specification = specification.and(buildStringSpecification(criteria.getCiudad(), Inmueble_.ciudad));
            }

            // if(criteria.getPrecio() != null){
            //     specification = specification.and(buildRangeSpecification(criteria.getPrecio(), Inmueble_.precio));
            // }

            if(criteria.getSuperficie() != null){
                specification = specification.and(buildRangeSpecification(criteria.getSuperficie(), Inmueble_.superficie));
            }

            if(criteria.getNumBanos() != null){
                specification = specification.and(buildRangeSpecification(criteria.getNumBanos(), Inmueble_.numBanos));
            }

            if(criteria.getNumHabitaciones() != null){
                specification = specification.and(buildRangeSpecification(criteria.getNumHabitaciones(), Inmueble_.numHabitaciones));
            }

            if(criteria.getServicios() != null){
                specification = specification.and(buildSpecification(criteria.getServicios(), (Function<Root<Inmueble>, Expression<String>>) Inmueble_.servicios));
            }
        }
        return specification;
    }

    @Override
    public List<Inmueble> getInmueblesFiltrados(InmuebleCriteria inmuebleCriteria) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
