package com.usa.hackathon.repositorio;

import com.usa.hackathon.modelo.Opinion;
import com.usa.hackathon.repositoriocrud.OpinionCrudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OpinionRepositorio {

    @Autowired
    private OpinionCrudRepositorio opinionCrudRepositorio;

    public List<Opinion> getAll() {
        return (List<Opinion>) opinionCrudRepositorio.findAll();
    }

    public Optional<Opinion> getOpinion(int idOpinion) {
        return opinionCrudRepositorio.findById(idOpinion);
    }

    public Opinion guardar(Opinion opinion) {
        return opinionCrudRepositorio.save(opinion);
    }

}
