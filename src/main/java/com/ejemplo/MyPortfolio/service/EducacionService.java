package com.ejemplo.MyPortfolio.service;

import com.ejemplo.MyPortfolio.model.Educacion;
import com.ejemplo.MyPortfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducService {
    
    @Autowired
    public EducacionRepository educRepo;

    @Override
    public List<Educacion> verEducacion() {
        return educRepo.findAll();
    }

    @Override
    public void borrarEducacion(Long id) {
        educRepo.deleteById(id);
    }

    @Override
    public void modificaEduc(Educacion skill) {
       
    }

    @Override
    public void crearEducacion(Educacion educ) {
        educRepo.save(educ);
    }
    
}
