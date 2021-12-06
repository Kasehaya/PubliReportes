package com.usa.hackathon.repositorio;

import com.usa.hackathon.modelo.Trayecto;
import com.usa.hackathon.repositoriocrud.TrayectoCrudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TrayectoRepositorio {

    @Autowired
    private TrayectoCrudRepositorio trayectoCrudRepositorio;

    public List<Trayecto> getTrayectos() {
        return (List<Trayecto>) trayectoCrudRepositorio.findAll();
    }

    public Optional<Trayecto> getTrayecto(int idTrayecto) {
        return trayectoCrudRepositorio.findById(idTrayecto);
    }

    public Trayecto guardarTrayecto(Trayecto trayecto) {
        return trayectoCrudRepositorio.save(trayecto);
    }
    
}
