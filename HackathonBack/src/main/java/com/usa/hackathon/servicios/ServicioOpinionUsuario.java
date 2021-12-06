package com.usa.hackathon.servicios;

import com.usa.hackathon.modelo.Opinion;
import com.usa.hackathon.modelo.OpinionCompleta;
import com.usa.hackathon.modelo.OpinionUsuarios;
import com.usa.hackathon.repositorio.OpinionRepositorio;
import com.usa.hackathon.repositorio.OpinionUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class ServicioOpinionUsuario {

    @Autowired
    private OpinionUsuarioRepositorio opinionUsuarioRepositorio;
    @Autowired
    private OpinionRepositorio opinionRepositorio;

    public List<OpinionCompleta> getAll() {
        return opinionUsuarioRepositorio.getAll();
    }

    public List<OpinionCompleta> getOpinionUsuarios(int idOpinionUsuario) {
        return opinionUsuarioRepositorio.getOpinionUsuario(idOpinionUsuario);
    }

    public OpinionCompleta guardarOpinion(OpinionCompleta opinionCompleta) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        Opinion opinion = new Opinion();
        opinion.setOpinion(opinionCompleta.getOpinion());
        opinion.setCalificacion(opinionCompleta.getCalificacion());
        opinion.setRecomendacion(opinionCompleta.getRecomendacion());
        opinion.setFecha("" + dateFormat.format(date));
        opinionRepositorio.guardar(opinion);
        System.out.println(opinion.getIdOpinion() + " " + opinion.getOpinion() + " " + opinion.getCalificacion() + " " + opinion.getRecomendacion() + " " + opinion.getFecha());

        OpinionUsuarios opinionUsuarios = new OpinionUsuarios();

        opinionUsuarios.setIdUsuario(opinionCompleta.getIdUsuario());
        opinionUsuarios.setIdOpinion(opinion.getIdOpinion());
        System.out.println(opinionUsuarios.getIdOpinion() + "" + opinionUsuarios.getIdUsuario());
        opinionUsuarioRepositorio.guardar(opinionUsuarios);

        opinionCompleta.setIdOpinion(opinion.getIdOpinion());
        return opinionCompleta;
    }

}
