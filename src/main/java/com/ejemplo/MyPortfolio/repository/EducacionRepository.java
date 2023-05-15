package com.ejemplo.MyPortfolio.repository;

import com.ejemplo.MyPortfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion,Long> {
    
}
