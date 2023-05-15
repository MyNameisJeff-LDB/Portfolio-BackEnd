package com.ejemplo.MyPortfolio.service;

import com.ejemplo.MyPortfolio.model.Proyectos;
import java.util.List;


public interface IProyService {
    public List<Proyectos> verProyectos();
    public void crearProyecto (Proyectos proy);
    public void borrarProyecto(Long id);
    public void modificaProyecto(Proyectos skill);
}
