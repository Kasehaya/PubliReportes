package com.usa.hackathon.repositorio;

import com.usa.hackathon.modelo.OpinionCompleta;
import com.usa.hackathon.modelo.OpinionUsuarios;
import com.usa.hackathon.repositoriocrud.OpinionUsuarioCrudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OpinionUsuarioRepositorio {

    @Autowired
    private OpinionUsuarioCrudRepositorio opinionUsuarioCrudRepositorio;

    public List<OpinionUsuarios> getOpinionUsuarios() {
        return (List<OpinionUsuarios>) opinionUsuarioCrudRepositorio.findAll();
    }

    public List<OpinionCompleta> getAll() {
        return opinionUsuarioCrudRepositorio.getAll();
    }

    public List<OpinionCompleta> getOpinionUsuario(int cedula) {
        return opinionUsuarioCrudRepositorio.findByCedula(cedula);
    }

    public OpinionUsuarios guardar(OpinionUsuarios opinionUsuarios) {
        return opinionUsuarioCrudRepositorio.save(opinionUsuarios);
    }

}
