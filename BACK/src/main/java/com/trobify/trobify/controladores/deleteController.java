package com.trobify.trobify.controladores;

import com.trobify.trobify.clases.Inmueble;
import com.trobify.trobify.servicios.crudInmuebleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deleteImueble")
@CrossOrigin(origins = "http://localhost:4200")
public class deleteController {
    @Autowired
    private crudInmuebleService service;

    @PostMapping
    public void recibeInmueble(@RequestBody Inmueble inmueble){
        service.deleteInmueble(inmueble.getId());
    }
}
