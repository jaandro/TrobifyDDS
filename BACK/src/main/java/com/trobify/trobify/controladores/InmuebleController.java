package com.trobify.trobify.controladores;

import java.util.List;

import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import com.trobify.trobify.criteria.InmuebleCriteria;
import com.trobify.trobify.dto.BusquedaDTO;
import com.trobify.trobify.servicios.InmuebleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@CrossOrigin(origins = "http://localhost:4200")
public class InmuebleController {

    @Autowired
    private InmuebleService service;

    @PostMapping
    public ResponseEntity<List<Inmueble>> list(@RequestBody BusquedaDTO busquedaDTO) {   
        InmuebleCriteria inmuebleCriteria = createCriteria(busquedaDTO);
        List<Inmueble> list = service.getInmueblesFiltrados(inmuebleCriteria);
        return new ResponseEntity<List<Inmueble>>(list, HttpStatus.OK); 
    }

    private InmuebleCriteria createCriteria(BusquedaDTO dto) {
        InmuebleCriteria inmuebleCriteria = new InmuebleCriteria();
        if(dto != null) {
            inmuebleCriteria.filtroCiudad(dto);
            inmuebleCriteria.filtroPrecio(dto, this);
            inmuebleCriteria.filtroSuperficie(dto, this);
            inmuebleCriteria.filtroBanos(dto, this);
            inmuebleCriteria.filtroHabitaciones(dto, this);
        }
        return inmuebleCriteria;
    }
    
}
