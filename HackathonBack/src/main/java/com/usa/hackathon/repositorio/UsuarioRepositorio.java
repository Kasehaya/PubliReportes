package com.usa.hackathon.repositorio;

import com.usa.hackathon.modelo.Usuario;
import com.usa.hackathon.repositoriocrud.UsuarioCrudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepositorio {

    @Autowired
    private UsuarioCrudRepositorio usuarioCrudRepositorio;

    public List<Usuario> getAll() {
        return (List<Usuario>) usuarioCrudRepositorio.findAll();
    }

    public Optional<Usuario> getUsuario(int idUsuario) {
        return usuarioCrudRepositorio.findById(idUsuario);
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioCrudRepositorio.save(usuario);
    }

}
