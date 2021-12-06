package com.usa.hackathon.modelo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ruta")
public class Ruta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRuta;
    private String ruta;

    @ManyToOne
    @JoinColumn(name = "idTransporte")
    @JsonIgnoreProperties({"ruta", "transporte"})
    private Transporte transporte;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "ruta")
    @JsonIgnoreProperties({"ruta"})
    private List<Trayecto> trayectos;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "ruta")
    @JsonIgnoreProperties({"ruta"})
    private List<ParaderoRuta> paraderoRutas;

    public Integer getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Integer idRuta) {
        this.idRuta = idRuta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public List<Trayecto> getTrayectos() {
        return trayectos;
    }

    public void setTrayectos(List<Trayecto> trayectos) {
        this.trayectos = trayectos;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

}
