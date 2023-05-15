package com.ejemplo.MyPortfolio.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre_y_apellido;
    private LocalDate nac;
    private String domicilio;
    private String correo;
    private String sobre_mi;
    private String url_foto;
    private String url_banner;
    
    public Persona(){
        
    }
    
    public Persona(Long id,String nombre_y_apellido,LocalDate nac,String domicilio,String correo,String sobre_mi,String url_foto,String url_banner){
               
        this.id = id;
        this.nombre_y_apellido = nombre_y_apellido;
        this.nac = nac;
        this.domicilio = domicilio;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
        this.url_banner = url_banner;
          
    }
    
}
