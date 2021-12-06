package com.usa.hackathon.modelo;

import javax.persistence.*;
import java.util.Date;
import java.util.IdentityHashMap;

@Entity
@Table(name = "trayecto")
public class Trayecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTrayecto;
    private String tipoTrayecto; // Salida - Destino
    private Date fecha;

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
}
