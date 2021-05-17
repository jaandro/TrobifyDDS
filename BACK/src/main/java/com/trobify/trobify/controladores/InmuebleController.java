package com.trobify.trobify.controladores;

import java.util.ArrayList;
import java.util.List;

import com.trobify.trobify.clases.ImagenesBDA;
import com.trobify.trobify.clases.InmuebleFabrica.CreadorInmueble;
import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import com.trobify.trobify.criteria.InmuebleCriteria;
import com.trobify.trobify.criteria.precioCriteria;
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
    @Autowired
    private InmuebleRepository inmuebleRep;
    @Autowired
    private ImagenAppRepository imgRep;

    @PostMapping
    public ResponseEntity<Boolean> list(@RequestBody BusquedaDTO busquedaDTO) {    //requetBody BusquedaDTO recibes del front la busqueda         
        // InmuebleCriteria inmuebleCriteria = createCriteria(busquedaDTO);
        // List<Inmueble> list = service.getInmueblesFiltrados(busquedaDTO);
        System.out.println("AÑLSKDJFLKASÑDJFLKSADJFLKASDJFLKSADJFLÑKSAJFDLSAÑKDFJDSALÑKFJSA");
        ImagenesBDA img = ImagenesBDA.getInstancia();
        // ImagenesBDA img = ImagenesBDA.getLogo();
        System.out.println(img.toString());
        return new ResponseEntity<Boolean>(true, HttpStatus.OK); //se devuelve la lista de inmuebles al front
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
