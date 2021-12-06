package com.usa.hackathon.servicios;

import com.usa.hackathon.modelo.Paradero;
import com.usa.hackathon.repositorio.ParaderoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioParadero {

    @Autowired
    private ParaderoRepositorio paraderoRepositorio;

    public List<Paradero> getParaderos() {
        return paraderoRepositorio.getAll();
    }

    public Optional<Paradero> getParadero(int idParadero) {
        return paraderoRepositorio.getParadero(idParadero);
    }

    public Paradero guardaParadero(Paradero paradero) {
        if (paradero.getIdParadero() == null) {
            return paradero;
        } else {
            Optional<Paradero> tmpParadero = paraderoRepositorio.getParadero(paradero.getIdParadero());
            if (tmpParadero.isEmpty()) {
                return paraderoRepositorio.guardarParadero(paradero);
            } else {
                return paradero;
            }
        }
    }

}
