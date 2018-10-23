package edu.umss.fcyt.TourismRestAPI.module.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_genero;

    private String nombre;

    public Genero(){}
    public Genero(Long id,String text){
        this.id_genero = id;
        this.nombre = text;
    }
    public Genero(String text){
        this.nombre = text;
    }

    public String getText() {
        return nombre;
    }

    public Long getId() {
        return id_genero;
    }

    public void setNombre(String s){
        nombre =s;
    }
}
