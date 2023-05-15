package com.ejemplo.MyPortfolio.service;

import com.ejemplo.MyPortfolio.model.LaboralExp;
import com.ejemplo.MyPortfolio.repository.LabExpRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabExpService implements ILabExpService {
    
    @Autowired
    public LabExpRepository labExpRepo;

    @Override
    public List<LaboralExp> verLabExp() {
        return labExpRepo.findAll();
    }

    @Override
    public void crearLabExp(LaboralExp exp) {
        labExpRepo.save(exp);
    }

    @Override
    public void borrarLabExp(Long id) {
       labExpRepo.deleteById(id);
    }

    @Override
    public void modificaLabExp(LaboralExp skill) {
        
    }
    
}
