package com.ejemplo.MyPortfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class LaboralExp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idexperiencia_laboral;
    private String position;
    private String company;
    private String url_logo_company;
    private String cityjob;
    private String cicle;
    private Long persona_id;
    
    
    public LaboralExp(){}
    
    public LaboralExp(Long idexperiencia_laboral,String position,String company,String url_logo_company,String cityjob,String cicle,Long persona_id){
        
        this.idexperiencia_laboral = idexperiencia_laboral;
        this.position = position;
        this.company = company;
        this.url_logo_company = url_logo_company;
        this.cityjob = cityjob;
        this.cicle = cicle;
        this.persona_id = persona_id;
    
    
    }
    
}
