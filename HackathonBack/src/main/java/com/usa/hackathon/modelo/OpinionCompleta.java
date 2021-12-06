package com.usa.hackathon.modelo;

import java.util.Date;

public class OpinionCompleta {

    private int idUsuario;
    private int idOpinion;
    private String opinion;
    private int calificacion;
    private String recomendacion;
    private Date fecha;

    public OpinionCompleta() {

    }

    public OpinionCompleta (int idUsuario, int idOpinion, int idRuta, String opinion, int calificacion, String recomendacion, Date fecha) {
        this.idUsuario = idUsuario;
        this.idOpinion = idOpinion;
        this.opinion = opinion;
        this.calificacion = calificacion;
        this.recomendacion = recomendacion;
        this.fecha = fecha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdOpinion() {
        return idOpinion;
    }

    public void setIdOpinion(int idOpinion) {
        this.idOpinion = idOpinion;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
