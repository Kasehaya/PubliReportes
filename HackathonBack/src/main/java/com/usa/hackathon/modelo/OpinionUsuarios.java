package com.usa.hackathon.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "opinionusuarios")
public class OpinionUsuarios implements Serializable {

    @Id
    private Integer idOp;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    @JsonIgnoreProperties({"usuario"})
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idOpinion")
    @JsonIgnoreProperties({"opinion"})
    private Opinion opinion;

    public Usuario getUsuario() {
        return usuario;
    }

    public Opinion getOpinion() {
        return opinion;
    }

}
