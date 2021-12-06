package com.usa.hackathon.repositorio;

import com.usa.hackathon.modelo.Transporte;
import com.usa.hackathon.repositoriocrud.TransportesCrudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TransporteRepositorio {

    @Autowired
    private TransportesCrudRepositorio transportesCrudRepositorio;

    public List<Transporte> getTransportes() {
        return (List<Transporte>) transportesCrudRepositorio.findAll();
    }

    public Optional<Transporte> getTransporte(int idTransporte) {
        return transportesCrudRepositorio.findById(idTransporte);
    }

    public Transporte guardarTransporte(Transporte transporte) {
        return transportesCrudRepositorio.save(transporte);
    }

}
