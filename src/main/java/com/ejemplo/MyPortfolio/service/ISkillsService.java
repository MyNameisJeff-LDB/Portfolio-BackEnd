package com.ejemplo.MyPortfolio.service;

import com.ejemplo.MyPortfolio.model.Skills;
import java.util.List;


public interface ISkillsService {
    public List<Skills> verSkills();
    public void crearSkill (Skills skill);
    public void borrarSkill(Long id);
    public void modificaSkill(Skills skill);
    
    
}
