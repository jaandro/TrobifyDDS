package com.trobify.trobify.servicios;

import com.trobify.trobify.clases.ImagenesBDA;
import com.trobify.trobify.repositorios.ImagenAppRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenesBDAService {
    
    @Autowired
    private static ImagenAppRepository imgRepo;
    
    public ImagenesBDA getImg(String s){
        return imgRepo.findByNombre(s);
    }
}
