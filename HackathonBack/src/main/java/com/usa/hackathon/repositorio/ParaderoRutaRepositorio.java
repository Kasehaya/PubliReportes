package com.usa.hackathon.repositorio;

import com.usa.hackathon.modelo.ParaderoRuta;
import com.usa.hackathon.repositoriocrud.ParaderoRutaCrudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ParaderoRutaRepositorio {

    @Autowired
    private ParaderoRutaCrudRepositorio paraderoRutaCrudRepositorio;

    public List<ParaderoRuta> getParaderoRutas() {
        return (List<ParaderoRuta>) paraderoRutaCrudRepositorio.findAll();
    }

    public Optional<ParaderoRuta> getParaderoRuta(int idParaderoRuta) {
        return paraderoRutaCrudRepositorio.findById(idParaderoRuta);
    }

    public ParaderoRuta guardarParaderoRuta(ParaderoRuta paraderoRuta) {
        return paraderoRutaCrudRepositorio.save(paraderoRuta);
    }

    public void borrarParaderoRuta (ParaderoRuta paraderoRuta) {
        paraderoRutaCrudRepositorio.delete(paraderoRuta);
    }

}
