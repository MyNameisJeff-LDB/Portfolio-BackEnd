package com.ejemplo.MyPortfolio.repository;

import com.ejemplo.MyPortfolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyectos,Long> {
    
}
