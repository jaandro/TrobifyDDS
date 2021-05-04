package com.trobify.trobify.controladores;

import java.util.List;

import com.trobify.trobify.clases.Inmueble;
import com.trobify.trobify.criteria.InmuebleCriteria;
import com.trobify.trobify.dto.BusquedaDTO;
import com.trobify.trobify.servicios.InmuebleService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.StringFilter;

@RestController
@RequestMapping("/home")
@CrossOrigin(origins = "http://localhost:4200")
public class InmuebleController {

    @Autowired
    private InmuebleService service;

    @PostMapping
    public ResponseEntity<List<Inmueble>> list(@RequestBody BusquedaDTO busquedaDTO) {    //requetBody BusquedaDTO recibes del front la busqueda 
        InmuebleCriteria inmuebleCriteria = createCriteria(busquedaDTO);
        List<Inmueble> list = service.getInmueblesFiltrados(inmuebleCriteria);
        System.out.println("AÑLSKDJFLKASÑDJFLKSADJFLKASDJFLKSADJFLÑKSAJFDLSAÑKDFJDSALÑKFJSA");
        return new ResponseEntity<List<Inmueble>>(list, HttpStatus.OK); //se devuelve la lista de inmuebles al front
    }

    private InmuebleCriteria createCriteria(BusquedaDTO dto) {
        InmuebleCriteria inmuebleCriteria = new InmuebleCriteria();
        if(dto != null) {

            if(!StringUtils.isBlank(dto.getCiudad())) {
                StringFilter filter = new StringFilter();
                filter.setEquals(dto.getCiudad());
                inmuebleCriteria.setCiudad(filter);
            }

            if(dto.getPrecioDesde() != null || dto.getPrecioHasta() != null) {
                IntegerFilter filter = new IntegerFilter();
                if(dto.getPrecioDesde()!=null){
                    filter.setGreaterThanOrEqual(dto.getPrecioDesde());
                    inmuebleCriteria.setPrecio(filter);
                }
                if(dto.getPrecioHasta()!=null){
                    filter.setLessThanOrEqual(dto.getPrecioHasta());
                    inmuebleCriteria.setPrecio(filter);
                }
            }

            if(dto.getSuperficieDesde() != null || dto.getSuperficieHasta() != null) {
                IntegerFilter filter = new IntegerFilter();
                if(dto.getSuperficieDesde()!=null){
                    filter.setGreaterThanOrEqual(dto.getSuperficieDesde());
                    inmuebleCriteria.setSuperficie(filter);
                }
                if(dto.getSuperficieHasta()!=null){
                    filter.setLessThanOrEqual(dto.getSuperficieHasta());
                    inmuebleCriteria.setSuperficie(filter);
                }
            }

            if(dto.getNumeroBanosMinimos() != null || dto.getNumeroBanosMaximos() != null) {
                IntegerFilter filter = new IntegerFilter();
                if(dto.getNumeroBanosMinimos()!=null){
                    filter.setGreaterThanOrEqual(dto.getNumeroBanosMinimos());
                    inmuebleCriteria.setNumBanos(filter);
                }
                if(dto.getNumeroBanosMaximos()!=null){
                    filter.setLessThanOrEqual(dto.getNumeroBanosMaximos());
                    inmuebleCriteria.setNumBanos(filter);
                }
            }

            if(dto.getNumeroHabitacionesMinimas() != null || dto.getNumeroHabitacionesMaximas() != null) {
                IntegerFilter filter = new IntegerFilter();
                if(dto.getNumeroHabitacionesMinimas()!=null){
                    filter.setGreaterThanOrEqual(dto.getNumeroHabitacionesMinimas());
                    inmuebleCriteria.setNumHabitaciones(filter);
                }
                if(dto.getNumeroHabitacionesMaximas()!=null){
                    filter.setLessThanOrEqual(dto.getNumeroHabitacionesMaximas());
                    inmuebleCriteria.setNumHabitaciones(filter);
                }
            }
        }
        return inmuebleCriteria;
    }
    
}
