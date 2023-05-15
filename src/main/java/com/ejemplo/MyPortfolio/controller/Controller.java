package com.ejemplo.MyPortfolio.controller;
import com.ejemplo.MyPortfolio.model.Educacion;
import com.ejemplo.MyPortfolio.model.LaboralExp;
import com.ejemplo.MyPortfolio.model.Persona;
import com.ejemplo.MyPortfolio.model.Proyectos;
import com.ejemplo.MyPortfolio.model.Skills;
import com.ejemplo.MyPortfolio.service.IEducService;
import com.ejemplo.MyPortfolio.service.ILabExpService;
import com.ejemplo.MyPortfolio.service.IPersonaService;
import com.ejemplo.MyPortfolio.service.IProyService;
import com.ejemplo.MyPortfolio.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200") // Permitir peticiones de localhost:4200

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService perServ; /////FUNCA
    @Autowired
    private IEducService educServ; /////FUNCA
    @Autowired
    private ILabExpService expServ; ////FUNCA
    @Autowired
    private IProyService proyServ; /////FUNCA
    @Autowired
    private ISkillsService skillServ; /////FUNCA
    
    ///////////////////////NUEVOS REGISTROS//////////////////////////////
       
    @PostMapping ("/new/persona") ////FUNCA
    public void agregarPersona(@RequestBody Persona pers) {
        perServ.crearPersona(pers);
    }
    
    @PostMapping ("/new/skill") ////FUNCA
    public void agregarSkills(@RequestBody Skills skill) {
        skillServ.crearSkill(skill);
    }
    
    @PostMapping ("/new/educacion") ////FUNCA
    public void agregarEduc(@RequestBody Educacion educ) {
        educServ.crearEducacion(educ);
    }
    
    @PostMapping ("/new/experiencia") ////FUNCA
    public void agregarLabExp(@RequestBody LaboralExp exp) {
        expServ.crearLabExp(exp);
    }
    
    @PostMapping ("/new/proyecto") /////FUNCA
    public void agregarProyecto(@RequestBody Proyectos proy) {
        proyServ.crearProyecto(proy);
    }

    
    ///////////////////////VER LISTADOS////////////////////////////////////
    
    @GetMapping ("/ver/personas") 
    @ResponseBody
    public List<Persona> verPersonas() { ///////FUNCA
        return perServ.verPersonas(); 
    }
    
    @GetMapping ("/ver/educacion") 
    @ResponseBody
    public List<Educacion> verEducacion() { /////FUNCA
        return educServ.verEducacion();
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<LaboralExp> verLabExp() {  /////FUNCA
        return expServ.verLabExp();
    }
    
    @GetMapping ("/ver/proyectos") 
    @ResponseBody
    public List<Proyectos> verProyectos() { /////FUNCA
        return proyServ.verProyectos();
    }
    
    @GetMapping ("/ver/skills") 
    @ResponseBody
    public List<Skills> verSkills() { /////FUNCA
        return skillServ.verSkills();
    }
    
    
    
    ///////////////////////BORRAS DATOS////////////////////////////////////
    
    @DeleteMapping ("/delete/persona/{id}") //// FUNCA
    public void borrarPersona(@PathVariable Long id){
        perServ.borrarPersona(id);
    }
    
    @DeleteMapping ("/delete/skill/{id}") //// FUNCA
    public void borrarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);  
    }
    
    @DeleteMapping ("/delete/educacion/{id}") ////FUNCA
    public void borrarEduc(@PathVariable Long id){
        educServ.borrarEducacion(id);
    }
    
    @DeleteMapping ("/delete/proyecto/{id}")  ////FUNCA
    public void borrarProy(@PathVariable Long id){
        proyServ.borrarProyecto(id);
    }
    
    @DeleteMapping ("/delete/experiencia/{id}") ////FUNCA
    public void borrarExp(@PathVariable Long id){
        expServ.borrarLabExp(id);
    }
    
    
    //////////////////////BUSCAR X ID///////////////////////
    
    @GetMapping ("/buscar/persona/{id}") 
    @ResponseBody
    public Persona verPers(@PathVariable Long id) { 
        return perServ.buscarPersona(id);
    }
    
    
}
