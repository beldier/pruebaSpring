package edu.umss.fcyt.TourismRestAPI.module.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clasea")
public class ClaseA {

    @Id
    @Column( name = "ida")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String des;

    @OneToMany( mappedBy = "claseA")
    private List<ClaseB> claseCAssoc;

    public List<ClaseB> getClaseCAssoc() {
        return claseCAssoc;
    }

    public void setClaseCAssoc(List<ClaseB> claseCAssoc) {
        this.claseCAssoc = claseCAssoc;
    }

    public ClaseA(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
