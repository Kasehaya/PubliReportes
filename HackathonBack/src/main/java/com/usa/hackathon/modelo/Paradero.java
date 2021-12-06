package com.usa.hackathon.modelo;


import javax.persistence.*;

@Entity
@Table(name = "paradero")
public class Paradero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idParadero;
    private String nombre;
    private String nemotecnica;

    public Integer getIdParadero() {
        return idParadero;
    }

    public void setIdParadero(Integer idParadero) {
        this.idParadero = idParadero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNemotecnica() {
        return nemotecnica;
    }

    public void setNemotecnica(String nemotecnica) {
        this.nemotecnica = nemotecnica;
    }

}
