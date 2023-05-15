package com.ejemplo.MyPortfolio.service;

import com.ejemplo.MyPortfolio.model.Persona;
import com.ejemplo.MyPortfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository persRepo;

    @Override
    public List<Persona> verPersonas() {
        return persRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
        persRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persRepo.findById(id).orElse(null);
    }

    @Override
    public void modificaPersona(Persona pers) {
        
    }
    
}
