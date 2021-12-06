package com.usa.hackathon.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "opinionusuarios")
public class OpinionUsuarios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOp;

    private Integer idUsuario;

    private Integer idOpinion;

    public Integer getIdOp() {
        return idOp;
    }

    public void setIdOp(Integer idOp) {
        this.idOp = idOp;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOpinion() {
        return idOpinion;
    }

    public void setIdOpinion(Integer idOpinion) {
        this.idOpinion = idOpinion;
    }
}
