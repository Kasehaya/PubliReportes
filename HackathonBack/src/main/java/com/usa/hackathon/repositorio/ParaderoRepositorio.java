package com.usa.hackathon.repositorio;

import com.usa.hackathon.modelo.Paradero;
import com.usa.hackathon.repositoriocrud.ParaderoCrudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ParaderoRepositorio {

    @Autowired
    private ParaderoCrudRepositorio paraderoCrudRepositorio;

    public List<Paradero> getAll() {
        return (List<Paradero>) paraderoCrudRepositorio.findAll();
    }

    public Optional<Paradero> getParadero(int idParadero) {
        return paraderoCrudRepositorio.findById(idParadero);
    }



}
