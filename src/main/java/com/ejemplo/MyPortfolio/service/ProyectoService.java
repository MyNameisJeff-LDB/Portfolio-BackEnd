package com.ejemplo.MyPortfolio.service;

import com.ejemplo.MyPortfolio.model.Proyectos;
import com.ejemplo.MyPortfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyService {
    
    @Autowired
    public ProyectoRepository proyRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyectos proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
       proyRepo.deleteById(id);
    }

    @Override
    public void modificaProyecto(Proyectos skill) {
        
    }
    
}
