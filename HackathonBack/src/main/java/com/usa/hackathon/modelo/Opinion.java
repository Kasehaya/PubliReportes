package com.usa.hackathon.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "opinion")
public class Opinion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOpinion;
    private String opinion;
    private Integer calificacion;
    private String recomendacion;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "opinion")
    @JsonIgnoreProperties({"opinion"})
    private List<OpinionUsuarios> opinionUsuarios;

    public Integer getIdOpinion() {
        return idOpinion;
    }

    public void setIdOpinion(Integer idOpinion) {
        this.idOpinion = idOpinion;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public List<OpinionUsuarios> getOpinionUsuarios() {
        return opinionUsuarios;
    }

    public void setOpinionUsuarios(List<OpinionUsuarios> opinionUsuarios) {
        this.opinionUsuarios = opinionUsuarios;
    }

}
