package edu.umss.fcyt.TourismRestAPI.module.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clasec")
public class ClaseC {

    @Id
    @Column( name = "idc")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String des;

    @OneToMany(mappedBy = "claseC")
    private List<ClaseB> claseCAssoc;


    public List<ClaseB> getClaseCAssoc() {
        return claseCAssoc;
    }

    public void setClaseCAssoc(List<ClaseB> claseCAssoc) {
        this.claseCAssoc = claseCAssoc;
    }

    public ClaseC(){}

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
