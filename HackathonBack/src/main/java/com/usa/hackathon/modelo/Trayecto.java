package com.usa.hackathon.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trayecto")
public class Trayecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTrayecto;
    private String tipoTrayecto; // Salida - Destino
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "idRuta")
    @JsonIgnoreProperties({"trayecto"})
    private Ruta ruta;

    public Integer getIdTrayecto() {
        return idTrayecto;
    }

    public void setIdTrayecto(Integer idTrayecto) {
        this.idTrayecto = idTrayecto;
    }

    public String getTipoTrayecto() {
        return tipoTrayecto;
    }

    public void setTipoTrayecto(String tipoTrayecto) {
        this.tipoTrayecto = tipoTrayecto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
}
