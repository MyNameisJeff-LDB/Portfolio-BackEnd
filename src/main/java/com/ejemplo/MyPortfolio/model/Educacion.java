package com.ejemplo.MyPortfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_educacion;
    private String institucion;
    private String carrera;
    private String inicio;
    private String fin;
    private String url_logoInst;
    private Long persona_id;
        
    public Educacion(){}
    
    public Educacion(Long id_educacion,String institucion,String carrera, String inicio,String fin,String url_logoInst,Long persona_id){
    
    this.id_educacion = id_educacion;
    this.institucion = institucion;
    this.carrera = carrera;
    this.inicio = inicio;
    this.fin = fin;
    this.url_logoInst = url_logoInst;
    this.persona_id = persona_id;
        
        
    }
    
    
    
}
