package com.trobify.trobify.controladores;

import java.util.List;

import com.trobify.trobify.clases.Foto;
import com.trobify.trobify.clases.Servicios;
import com.trobify.trobify.clases.TipoVivienda;
import com.trobify.trobify.clases.InmuebleFabrica.CreadorInmueble;
import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;
import com.trobify.trobify.dto.InmuebleDTO;
import com.trobify.trobify.servicios.crudInmuebleService;
import com.trobify.trobify.servicios.fotosService;
import com.trobify.trobify.servicios.serviciosInmuebleService;
import com.trobify.trobify.servicios.tipoViviendaService;

import org.hibernate.annotations.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addEditInmueble")
@CrossOrigin(origins = "http://localhost:4200")
public class addEditController {
    @Autowired
    private crudInmuebleService crudService;

        @Autowired
        private fotosService fotosService;
    
    @Autowired
    private serviciosInmuebleService serviciosService;

    @Autowired
    private tipoViviendaService tipoViviendaservice;

    @PostMapping
    public void recibeInmueble(@RequestBody Inmueble inmueble){
        crudService.saveInmueble(inmueble);
    }
}
