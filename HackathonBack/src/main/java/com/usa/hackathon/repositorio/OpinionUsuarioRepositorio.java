package com.usa.hackathon.repositorio;

import com.usa.hackathon.modelo.Opinion;
import com.usa.hackathon.modelo.OpinionUsuarios;
import com.usa.hackathon.repositoriocrud.OpinionUsuarioCrudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OpinionUsuarioRepositorio {

    @Autowired
    private OpinionUsuarioCrudRepositorio opinionUsuarioCrudRepositorio;

    public List<OpinionUsuarios> getAll() {
        return (List<OpinionUsuarios>) opinionUsuarioCrudRepositorio.getAll();
    }

    public List<OpinionUsuarios> getOpinionUsuario(int cedula) {
        return (List<OpinionUsuarios>) opinionUsuarioCrudRepositorio.findByCedula(cedula);
    }

    public OpinionUsuarios guardarOpinionUsuario(OpinionUsuarios opinionUsuarios) {
        return opinionUsuarioCrudRepositorio.save(opinionUsuarios);
    }

}
