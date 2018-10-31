package edu.umss.fcyt.TourismRestAPI.module.controlador;

import edu.umss.fcyt.TourismRestAPI.module.modelo.ClaseB;
import edu.umss.fcyt.TourismRestAPI.module.modelo.ClaseC;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.ClaseBRepositorio;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.ClaseCRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path="/claseB")
public class ClaseBControlador {

    @Autowired
    private ClaseBRepositorio claseBRepositorio;

    @RequestMapping(path="/get", method=GET )
    public Iterable<ClaseB> getClase(){

        return claseBRepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public ClaseB ingresar(@RequestBody ClaseB clase){
        return claseBRepositorio.save(clase);
    }

}