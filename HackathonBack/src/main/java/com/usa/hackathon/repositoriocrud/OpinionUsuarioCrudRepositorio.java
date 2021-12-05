package com.usa.hackathon.repositoriocrud;

import com.usa.hackathon.modelo.OpinionUsuarios;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OpinionUsuarioCrudRepositorio extends CrudRepository<OpinionUsuarios, Integer> {

    @Query("SELECT ou.id_op, ou.id_usuario, u.nombre, u.email,o.opinion, o.calificacion, o.recomendacion FROM hackathon.opinion_usuarios ou LEFT JOIN usuarios u ON ou.id_usuario = u.id_usuario LEFT JOIN opiniones o ON ou.id_opinion = o.id_opinion")
    OpinionUsuarios getAll();

    @Query("SELECT ou.id_op, ou.id_usuario, u.nombre, u.email,o.opinion, o.calificacion, o.recomendacion FROM hackathon.opinion_usuarios ou LEFT JOIN usuarios u ON ou.id_usuario = u.id_usuario LEFT JOIN opiniones o ON ou.id_opinion = o.id_opinion WHERE ou.id_usuario = ?1;")
    OpinionUsuarios findByCedula(int idUsuario);

}
