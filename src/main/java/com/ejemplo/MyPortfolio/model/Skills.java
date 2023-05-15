package com.ejemplo.MyPortfolio.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idskills;
    private String name_skill;
    private Long progress;
    private Long persona_id;
        
    
    public Skills(){}
    
    public Skills(Long idskills,String name_skill,Long progress,Long persona_id){
        
        this.idskills = idskills;
        this.name_skill = name_skill;
        this.progress = progress;
        this.persona_id = persona_id;
        
    }
    
}
