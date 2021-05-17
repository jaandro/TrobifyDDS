package com.trobify.trobify.clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.trobify.trobify.repositorios.ImagenAppRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "imagenesAPP")
public class ImagenesBDA {

    @Autowired
    private static ImagenAppRepository imgRepo;

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String imagen;
    private String nombre;

    
    private static ImagenesBDA instance = new ImagenesBDA();

    private ImagenesBDA() {}

    public static ImagenesBDA getInstancia() {
        if(instance == null){
            instance = getLogo();
        }
        return instance;
    }

    private static ImagenesBDA getLogo(){
        return imgRepo.findByNombre("logo");
    }

    @Override
    public String toString() {
        return "ImagenesBDA [id=" + id + ", imagen=" + imagen + ", nombre=" + nombre + "]";
    }
    
}
