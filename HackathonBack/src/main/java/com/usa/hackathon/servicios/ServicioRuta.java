package com.usa.hackathon.servicios;

import com.usa.hackathon.modelo.Ruta;
import com.usa.hackathon.repositorio.RutaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioRuta {

    @Autowired
    private RutaRepositorio rutaRepositorio;

    public List<Ruta> getRutas() {
        return rutaRepositorio.getRutas();
    }

    public Optional<Ruta> getRuta(int idRuta) {
        return rutaRepositorio.getRuta(idRuta);
    }

    public Ruta guardarRuta(Ruta ruta) {
        if (ruta.getIdRuta() == null) {
            return rutaRepositorio.guardarRuta(ruta);
        } else {
            Optional<Ruta> tmpRuta = rutaRepositorio.getRuta(ruta.getIdRuta());
            if (tmpRuta.isEmpty()) {
                return rutaRepositorio.guardarRuta(ruta);
            } else {
                return ruta;
            }
        }
    }

}
