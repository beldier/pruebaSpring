package edu.umss.fcyt.TourismRestAPI.module.modelo.modeloID;

import java.io.Serializable;
import java.util.Objects;

public class ClaseBId implements Serializable {
    private Long claseA;
    private Long claseC;

    public Long getida() {
        return claseA;
    }

    public void setclaseA(Long claseA) {
        this.claseA = claseA;
    }

    public Long getclaseC() {
        return claseC;
    }

    public void setclaseC(Long claseC) {
        this.claseC = claseC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClaseBId claseBId = (ClaseBId) o;
        return Objects.equals(claseA, claseBId.claseA) &&
                Objects.equals(claseC, claseBId.claseC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claseA, claseC);
    }
}
