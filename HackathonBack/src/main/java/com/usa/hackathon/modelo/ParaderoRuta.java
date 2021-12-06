package com.usa.hackathon.modelo;

import javax.persistence.*;

@Entity
@Table(name = "paraderoruta")
public class ParaderoRuta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPr;
    private Integer idRuta;
    private Integer idParada;

    public Integer getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Integer idRuta) {
        this.idRuta = idRuta;
    }

    public Integer getIdParada() {
        return idParada;
    }

    public void setIdParada(Integer idParada) {
        this.idParada = idParada;
    }

}
