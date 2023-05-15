package com.ejemplo.MyPortfolio.service;

import com.ejemplo.MyPortfolio.model.LaboralExp;
import java.util.List;


public interface ILabExpService {
    public List<LaboralExp> verLabExp();
    public void crearLabExp (LaboralExp exp);
    public void borrarLabExp(Long id);
    public void modificaLabExp(LaboralExp skill);
}
