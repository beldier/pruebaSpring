package edu.umss.fcyt.TourismRestAPI.module.controlador;

import edu.umss.fcyt.TourismRestAPI.module.modelo.Genero;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.GeneroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

//solicitar desde angular
//crossorigin 
@RestController
@RequestMapping(path="/genero")
public class GeneroControlador {
    @Autowired
    private GeneroRepositorio generoRepositorio;
    //@RequestMapping(method = GET,path = "/get")
    @GetMapping(path="/get")
    public Iterable<Genero> getGenero(){

        return generoRepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public Genero ingresar(@RequestBody Genero genero){
        return generoRepositorio.save(genero);
    }

}
