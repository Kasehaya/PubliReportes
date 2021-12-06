package com.usa.hackathon.servicios;

import com.usa.hackathon.modelo.Transporte;
import com.usa.hackathon.repositorio.TransporteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioTransporte {

    @Autowired
    private TransporteRepositorio transporteRepositorio;

    public List<Transporte> getTransportes() {
        return transporteRepositorio.getTransportes();
    }

    public Optional<Transporte> getTransporte(int idTransporte) {
        return transporteRepositorio.getTransporte(idTransporte);
    }

    public Transporte guardarTransporte(Transporte transporte) {
        if (transporte.getIdTransporte() == null) {
            return transporteRepositorio.guardarTransporte(transporte);
        } else {
            Optional<Transporte> tmpTransporte = transporteRepositorio.getTransporte(transporte.getIdTransporte());
            if (tmpTransporte.isEmpty()) {
                return transporteRepositorio.guardarTransporte(transporte);
            } else {
                return transporte;
            }
        }
    }

}
