package com.ejemplo.MyPortfolio.repository;

import com.ejemplo.MyPortfolio.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <Skills,Long> {
    
}
