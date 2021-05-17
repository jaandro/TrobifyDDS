package com.trobify.trobify.repositorios;

import com.trobify.trobify.clases.ImagenesBDA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenAppRepository extends JpaRepository<ImagenesBDA,Integer> {
    ImagenesBDA findByNombre(String nombre);
}
