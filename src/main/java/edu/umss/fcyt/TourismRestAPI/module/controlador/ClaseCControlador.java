package edu.umss.fcyt.TourismRestAPI.module.controlador;

import edu.umss.fcyt.TourismRestAPI.module.modelo.ClaseA;
import edu.umss.fcyt.TourismRestAPI.module.modelo.ClaseC;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.ClaseARepositorio;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.ClaseCRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path="/claseC")
public class ClaseCControlador {
    @Autowired
    private ClaseCRepositorio claseCRepositorio;

    @RequestMapping(path="/get", method=GET )
    public Iterable<ClaseC> getClase(){

        return claseCRepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public ClaseC ingresar(@RequestBody ClaseC clase){
        return claseCRepositorio.save(clase);
    }

}
