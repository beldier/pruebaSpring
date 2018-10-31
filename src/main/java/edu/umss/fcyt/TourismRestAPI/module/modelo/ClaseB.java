package edu.umss.fcyt.TourismRestAPI.module.modelo;

import edu.umss.fcyt.TourismRestAPI.module.modelo.modeloID.ClaseBId;

import javax.persistence.*;

@Entity
@Table(name = "claseb")
@IdClass(ClaseBId.class)
public class ClaseB  {
    @Id
    @ManyToOne
    @JoinColumn( name = "id_a", referencedColumnName = "ida")
    private ClaseA claseA;

    @Id
    @ManyToOne
    @JoinColumn( name = "id_c", referencedColumnName = "idc")
    private ClaseC claseC;

    @Id
    @Column( name = "idc")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public ClaseA getClaseA() {
        return claseA;
    }

    public void setClaseA(ClaseA claseA) {
        this.claseA = claseA;
    }

    public ClaseC getClaseC() {
        return claseC;
    }

    public void setClaseC(ClaseC claseC) {
        this.claseC = claseC;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
