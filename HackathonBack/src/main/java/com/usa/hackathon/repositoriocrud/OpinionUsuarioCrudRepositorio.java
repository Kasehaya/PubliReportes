package com.usa.hackathon.repositoriocrud;

import com.usa.hackathon.modelo.OpinionCompleta;
import com.usa.hackathon.modelo.OpinionUsuarios;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OpinionUsuarioCrudRepositorio extends CrudRepository<OpinionUsuarios, Integer> {

    @Query(value = "SELECT u.id_usuario, o.id_opinion, o.opinion, o.calificacion, o.recomendacion, o.fecha FROM opinionusuarios ou INNER JOIN usuario u ON ou.id_usuario = u.id_usuario INNER JOIN opinion o ON ou.id_opinion = o.id_opinion", nativeQuery = true)
    public List<OpinionCompleta> getAll();

    @Query(value = "SELECT u.id_usuario, o.id_opinion, o.opinion, o.calificacion, o.recomendacion, o.fecha FROM opinionusuarios ou INNER JOIN usuario u ON ou.id_usuario = u.id_usuario INNER JOIN opinion o ON ou.id_opinion = o.id_opinion WHERE ou.id_usuario = ?1", nativeQuery = true)
    public List<OpinionCompleta> findByCedula(int idUsuario);

}
