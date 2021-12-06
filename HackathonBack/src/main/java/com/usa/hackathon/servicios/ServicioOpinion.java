package com.usa.hackathon.servicios;

import com.usa.hackathon.modelo.Opinion;
import com.usa.hackathon.repositorio.OpinionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioOpinion {

    @Autowired
    private OpinionRepositorio opinionRepositorio;

    public List<Opinion> getAll() {
        return opinionRepositorio.getAll();
    }

    public Optional<Opinion> getOpinion(int idOpinion) {
        return opinionRepositorio.getOpinion(idOpinion);
    }

    public Opinion guardar(Opinion opinion) {
        if (opinion.getIdOpinion() == null) {
            return opinionRepositorio.guardar(opinion);
        } else {
            Optional<Opinion> tmpOptional = opinionRepositorio.getOpinion(opinion.getIdOpinion());
            if (tmpOptional.isEmpty()) {
                return opinionRepositorio.guardar(opinion);
            } else {
                return opinion;
            }
        }
    }

}
