package com.usa.hackathon.servicios;

import com.usa.hackathon.modelo.Trayecto;
import com.usa.hackathon.repositorio.TrayectoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioTrayecto {

    @Autowired
    private TrayectoRepositorio trayectoRepositorio;

    public List<Trayecto> getTrayectos() {
        return trayectoRepositorio.getTrayectos();
    }

    public Optional<Trayecto> getTrayecto(int idTrayecto) {
        return trayectoRepositorio.getTrayecto(idTrayecto);
    }

    public Trayecto guardarTrayecto(Trayecto trayecto) {
        if (trayecto.getIdTrayecto() == null) {
            return trayectoRepositorio.guardarTrayecto(trayecto);
        } else {
            Optional<Trayecto> tmpTrayecto = trayectoRepositorio.getTrayecto(trayecto.getIdTrayecto());
            if (tmpTrayecto.isEmpty()) {
                return trayectoRepositorio.guardarTrayecto(trayecto);
            } else {
                return trayecto;
            }
        }
    }

}
