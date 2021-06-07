package com.trobify.trobify.servicios;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import com.trobify.trobify.clases.Inmueble_;
import com.trobify.trobify.adapter.Adapter;
import com.trobify.trobify.adapter.userAdapter;
import com.trobify.trobify.clases.Usuario;
import com.trobify.trobify.clases.Inmueble;
import com.trobify.trobify.criteria.InmuebleCriteria;
import com.trobify.trobify.criteria.ciudadCriteria;
import com.trobify.trobify.criteria.superficieCriteria;
import com.trobify.trobify.criteria.criteriaOperators.AndCriteria;
import com.trobify.trobify.criteria.criteriaOperators.ICriteria;
import com.trobify.trobify.dto.BusquedaDTO;
import com.trobify.trobify.dto.InmuebleDTO;
import com.trobify.trobify.dto.UserDTO;
import com.trobify.trobify.interfaces.InmuebleInterface;
import com.trobify.trobify.repositorios.InmuebleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import io.github.jhipster.service.QueryService;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.StringFilter;

@Service
public class InmuebleService extends QueryService<Inmueble> implements InmuebleInterface {

    @Autowired
    private InmuebleRepository inmuebleRep;

    public List<Inmueble> getInmueblesFiltrados(List<ICriteria> criterias){

        return testInmueblesSuperficie();

        // creamos neestras instancias de criteria
        // ICriteria precioCriteria = new superficieCriteria();

        // //añadimos las instancias de criteria en una list
        // List<ICriteria> criteriass = new ArrayList<ICriteria>();
        // criterias.add(precioCriteria);

        //se crea un operación and con la lista de criterios a filtrar
        // ICriteria filtros = new AndCriteria(criterias);

        // InmuebleCriteria criteria = new InmuebleCriteria();
        // Specification<Inmueble> specification = Specification.where(null);

        // //recuperamos la lista de inmuebles filtrada segun los parametros de busqueda
        // Specification<Inmueble> filtrados = filtros.meetCriteria(specification, criteria);
        // List<Inmueble> inmueblesFiltrados = inmuebleRep.findAll(filtrados);
        // System.out.println(inmueblesFiltrados);

        // System.out.println("--------------------------------------ADAPTER--------------------------------------");
        // List<userAdapter> users = new ArrayList<>();

        // Usuario userBDA = new Usuario();
        // users.add(userBDA);
        
        // UserDTO userDTO = new UserDTO();
        // users.add(new Adapter(userDTO));

        // System.out.println(users.get(0).toString());
        // System.out.println(users.get(1).toString());

        //return inmueblesFiltrados;
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

    public List<Inmueble> testInmueblesSuperficie() {

        List<ICriteria> criterias = new ArrayList<ICriteria> ();

        ICriteria superficieCriteria = new superficieCriteria();
        criterias.add(superficieCriteria);

        ICriteria filtros = new AndCriteria(criterias);

        IntegerFilter filter = new IntegerFilter();
        filter.setEquals(2);

        InmuebleCriteria criteria = new InmuebleCriteria();
        criteria.setSuperficie(filter);

        Specification<Inmueble> specification = Specification.where(null);

        Specification<Inmueble> filtrados = filtros.meetCriteria(specification, criteria);
        List<Inmueble> inmueblesFiltrados = inmuebleRep.findAll(filtrados);
        System.out.println(inmueblesFiltrados);

        return inmueblesFiltrados;
    }
    
}
