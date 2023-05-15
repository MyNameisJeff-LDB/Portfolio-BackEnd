package com.ejemplo.MyPortfolio.repository;

import com.ejemplo.MyPortfolio.model.LaboralExp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabExpRepository extends JpaRepository <LaboralExp, Long> {
    
}
