package com.usa.hackathon.servicios;

import com.usa.hackathon.modelo.ParaderoRuta;
import com.usa.hackathon.repositorio.ParaderoRutaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioParaderoRuta {

    @Autowired
    private ParaderoRutaRepositorio paraderoRutaRepositorio;

    public List<ParaderoRuta> getParaderoRutas() {
        return paraderoRutaRepositorio.getParaderoRutas();
    }

    public Optional<ParaderoRuta> getParaderoRuta(int idParaderoRuta) {
        return paraderoRutaRepositorio.getParaderoRuta(idParaderoRuta);
    }

    public ParaderoRuta guardarParaderoRuta(ParaderoRuta paraderoRuta) {
        if (paraderoRuta.getIdPr() == null ) {
            return paraderoRutaRepositorio.guardarParaderoRuta(paraderoRuta);
        } else {
            Optional<ParaderoRuta> tmpParaderoRuta = paraderoRutaRepositorio.getParaderoRuta(paraderoRuta.getIdPr());
            if (tmpParaderoRuta.isEmpty()) {
                return paraderoRutaRepositorio.guardarParaderoRuta(paraderoRuta);
            } else {
                return paraderoRuta;
            }
        }
    }

}
