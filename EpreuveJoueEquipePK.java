package com.cct.microcct.com.cct.model.Association;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EpreuveJoueEquipePK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "id_epreuve")
    private int idEpreuve;

    @Column(name = "id_equipe")
    private int idEquipe;

    @Column(name = "Points")
    private int points;

    @Column(name = "Bonus")
    private boolean bonus;

    public EpreuveJoueEquipePK() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
