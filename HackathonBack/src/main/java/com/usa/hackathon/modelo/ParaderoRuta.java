package com.usa.hackathon.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "paraderoruta")
public class ParaderoRuta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPr;

    @ManyToOne
    @JoinColumn(name = "idRuta")
    @JsonIgnoreProperties({"paraderoruta"})
    private Ruta ruta;

    @ManyToOne
    @JoinColumn(name = "idParadero")
    @JsonIgnoreProperties({"paraderoruta"})
    private Paradero paradero;

    public Integer getIdPr() {
        return idPr;
    }

    public void setIdPr(Integer idPr) {
        this.idPr = idPr;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Paradero getParadero() {
        return paradero;
    }

    public void setParadero(Paradero paradero) {
        this.paradero = paradero;
    }
}
