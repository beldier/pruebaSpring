package edu.umss.fcyt.TourismRestAPI.module.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genero {
    @Id
    private Integer id_genero;

    private String nombre;

    public Genero(){}
    public Genero(Integer id,String text){
        this.id_genero = id;
        this.nombre = text;
    }

    public String getText() {
        return nombre;
    }

    public Integer getId() {
        return id_genero;
    }
}
