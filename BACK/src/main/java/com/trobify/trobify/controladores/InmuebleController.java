package com.trobify.trobify.controladores;

import java.util.ArrayList;
import java.util.List;

import com.trobify.trobify.clases.ImagenesBDA;
import com.trobify.trobify.clases.Inmueble;
import com.trobify.trobify.criteria.InmuebleCriteria;
import com.trobify.trobify.criteria.superficieCriteria;
import com.trobify.trobify.criteria.criteriaOperators.AndCriteria;
import com.trobify.trobify.criteria.criteriaOperators.ICriteria;
import com.trobify.trobify.dto.BusquedaDTO;
import com.trobify.trobify.repositorios.ImagenAppRepository;
import com.trobify.trobify.repositorios.InmuebleRepository;
import com.trobify.trobify.servicios.ImagenesBDAService;
import com.trobify.trobify.servicios.InmuebleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InmuebleController {

    @Autowired
    private InmuebleService service;
    @Autowired
    private InmuebleRepository inmuebleRep;
    @Autowired
    private ImagenAppRepository imgRep;

    @PostMapping ("/home")
    public ResponseEntity<List<Inmueble>> list(@RequestBody BusquedaDTO busquedaDTO) {
        List<ICriteria> criteria = createCriteria(busquedaDTO);
        List<Inmueble> inmuebles = service.getInmueblesFiltrados(criteria);
        ImagenesBDA img = ImagenesBDA.getInstancia();
        System.out.println(img.toString());
        return new ResponseEntity<List<Inmueble>>(inmuebles, HttpStatus.OK);
    }

    @GetMapping ("/img")
    public ResponseEntity<ImagenesBDA> imgEntity(@RequestBody BusquedaDTO busquedaDTO) {
        ImagenesBDA img = ImagenesBDA.getInstancia();
        System.out.println(img.toString());
        return new ResponseEntity<ImagenesBDA>(img, HttpStatus.OK); //se devuelve la lista de inmuebles al front
    }

    private List<ICriteria> createCriteria(BusquedaDTO dto) {
        List<ICriteria> inmuebleCriteria = new ArrayList<ICriteria>();
        InmuebleCriteria rep = new InmuebleCriteria();
        if(dto != null) {
            inmuebleCriteria = rep.filtroCiudad(dto, inmuebleCriteria);
            // inmuebleCriteria = filtroPrecio(dto, inmuebleCriteria);
            // inmuebleCriteria = filtroSuperficie(dto, inmuebleCriteria);
            // inmuebleCriteria = filtroBanos(dto, inmuebleCriteria);
            // inmuebleCriteria = filtroHabitaciones(dto, inmuebleCriteria);
        }
        return inmuebleCriteria;
    }
    
}
