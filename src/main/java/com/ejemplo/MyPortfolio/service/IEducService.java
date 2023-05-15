package com.ejemplo.MyPortfolio.service;

import com.ejemplo.MyPortfolio.model.Educacion;
import java.util.List;



public interface IEducService {
    public List<Educacion> verEducacion();
    public void crearEducacion (Educacion educ);
    public void borrarEducacion(Long id);
    public void modificaEduc(Educacion skill);
    
    
}
