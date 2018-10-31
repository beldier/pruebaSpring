package edu.umss.fcyt.TourismRestAPI.module.controlador;

import edu.umss.fcyt.TourismRestAPI.module.modelo.ClaseA;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.ClaseARepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path="/claseA")
public class ClaseAControlador {
    @Autowired
    private ClaseARepositorio claseARepositorio;
    @RequestMapping(path="/get", method=GET )
    public Iterable<ClaseA> getClase(){

        return claseARepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public ClaseA ingresar(@RequestBody ClaseA clase){
        return claseARepositorio.save(clase);
    }

}
