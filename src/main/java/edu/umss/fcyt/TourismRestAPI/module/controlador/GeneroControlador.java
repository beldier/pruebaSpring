package edu.umss.fcyt.TourismRestAPI.module.controlador;

import edu.umss.fcyt.TourismRestAPI.module.modelo.Genero;
import edu.umss.fcyt.TourismRestAPI.module.repositorio.GeneroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//solicitar desde angular
//crossorigin 
@RestController
@RequestMapping(path="/genero")
public class GeneroControlador {
    @Autowired
    private GeneroRepositorio generoRepositorio;
    @GetMapping(path="/get")
    public Iterable<Genero> getGenero(){
        return generoRepositorio.findAll();
    }
    @GetMapping(path="/g1")
    public Genero g1()
    {
        return new Genero(1,"lol");
    }
    @GetMapping(path="/g2")
    public Genero g2()
    {
        return new Genero(1,"rekt");
    }

}
