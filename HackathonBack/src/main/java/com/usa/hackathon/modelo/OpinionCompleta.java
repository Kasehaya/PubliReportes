package com.usa.hackathon.modelo;

public class OpinionCompleta {

    private int idUsuario;
    private int idOpinion;
    private String opinion;
    private int calificacion;
    private String recomendacion;
    private String fecha;

    public OpinionCompleta (int idUsuario, int idOpinion, String opinion, int calificacion, String recomendacion, String fecha) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
