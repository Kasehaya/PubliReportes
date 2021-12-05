package com.usa.hackathon.servicios;

import com.usa.hackathon.modelo.OpinionUsuarios;
import com.usa.hackathon.repositorio.OpinionUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioOpinionUsuario {

    @Autowired
    private OpinionUsuarioRepositorio opinionUsuarioRepositorio;

    public List<OpinionUsuarios> getAll() {
        return opinionUsuarioRepositorio.getAll();
    }

    public List<OpinionUsuarios> getOpinionUsuarios(int idOpinionUsuario) {
        return opinionUsuarioRepositorio.getOpinionUsuario(idOpinionUsuario);
    }

}
