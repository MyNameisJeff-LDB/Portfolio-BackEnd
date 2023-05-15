package com.ejemplo.MyPortfolio.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idproyectos;
    private String name_proyect;
    private String description;
    private Long persona_id;
    
    
    public Proyectos(){}
    
    public Proyectos(Long idproyectos,String name_proyect,String description,Long persona_id){
        
        this.idproyectos = idproyectos;
        this.name_proyect = name_proyect;
        this.description = description;
        this.persona_id = persona_id;
        
        
    }
    
}
