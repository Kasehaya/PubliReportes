package com.usa.hackathon.repositorio;

import com.usa.hackathon.modelo.Ruta;
import com.usa.hackathon.repositoriocrud.RutaCrudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RutaRepositorio {

    @Autowired
    private RutaCrudRepositorio rutaCrudRepositorio;

    public List<Ruta> getRutas() {
        return (List<Ruta>) rutaCrudRepositorio.findAll();
    }

    public Optional<Ruta> getRuta(int idRuta) {
        return rutaCrudRepositorio.findById(idRuta);
    }

    public Ruta guardarRuta(Ruta ruta) {
        return rutaCrudRepositorio.save(ruta);
    }

}
