package com.trobify.trobify.controladores;

import java.util.List;

import com.trobify.trobify.clases.Foto;
import com.trobify.trobify.clases.Inmueble;
import com.trobify.trobify.clases.Servicios;
import com.trobify.trobify.clases.TipoVivienda;
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
        System.out.println("ASFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFJSFKJASKFJHDAJKFHDASDASDASDASDASDASDASDASDASDASDASDASDASDASDASDASSDJFS");
       // guardarFoto(inmueble);
        crudService.saveInmueble(inmueble);
        
        
        //fotosService.saveFotos(inmueble.getFotos().get(0));
    }

    public Foto guardarFoto(Inmueble inmueble) {
        Foto fotos = new Foto();
        fotos.setFoto("holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        fotos.setInmueble(inmueble);
        System.out.println("mecagoentusmuertos");
        return fotosService.saveFotos(fotos);
    }

    

    // @PostMapping
    // public void recibeFotos(@RequestBody Foto[] fotos){
    //     for(int i = 0; i <= fotos.length; i++){
    //         fotosService.saveFotos(fotos[i]);
    //     }  
    // }

    // @PostMapping
    // public void recibeServicios(@RequestBody Inmueble inmueble){
    //     for(int i = 0; i <= inmueble.getFotos().size(); i++){
    //         serviciosService.saveServicios(inmueble.getServicios().get(i));
    //     }  
    // }

    // @PostMapping
    // public void recibeTipoVivienda(@RequestBody Inmueble inmueble){
    //     for(int i = 0; i <= inmueble.getFotos().size(); i++){
    //         tipoViviendaservice.saveTipoVivienda(inmueble.getTipoViviendas().get(i));
    //     }  
    // }

}
