package com.ejemplo.MyPortfolio.service;

import com.ejemplo.MyPortfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona (Persona pers);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public void modificaPersona(Persona pers);

    
}
