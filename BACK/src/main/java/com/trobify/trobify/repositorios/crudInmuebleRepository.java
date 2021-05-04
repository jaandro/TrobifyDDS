package com.trobify.trobify.repositorios;
import com.trobify.trobify.clases.Inmueble;

import org.springframework.data.jpa.repository.JpaRepository;

public interface crudInmuebleRepository extends JpaRepository<Inmueble, Integer> {}
