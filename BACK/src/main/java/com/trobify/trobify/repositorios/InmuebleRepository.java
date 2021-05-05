package com.trobify.trobify.repositorios;
import com.trobify.trobify.clases.InmuebleFabrica.Inmueble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InmuebleRepository extends JpaRepository<Inmueble, Integer>, JpaSpecificationExecutor<Inmueble>{
}
