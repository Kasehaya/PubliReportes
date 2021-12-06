package com.usa.hackathon.servicios;

import com.usa.hackathon.modelo.Usuario;
import com.usa.hackathon.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioUsuario {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public List<Usuario> getAll() {
        return usuarioRepositorio.getAll();
    }

    public Optional<Usuario> getUsuario(int idUsuario) {
        return usuarioRepositorio.getUsuario(idUsuario);
    }

    public Usuario guardar(Usuario usuario) {
        if (usuario.getIdUsuario() == null) {
            return usuarioRepositorio.guardar(usuario);
        } else {
            Optional<Usuario> tmpUsuario = usuarioRepositorio.getUsuario(usuario.getIdUsuario());
            if (tmpUsuario.isEmpty()) {
                return usuarioRepositorio.guardar(usuario);
            } else {
                return usuario;
            }
        }
    }

    public Usuario actualizar(Usuario usuario) {
        if (usuario.getIdUsuario() != null) {
            Optional<Usuario> u = usuarioRepositorio.getUsuario(usuario.getIdUsuario());
            if (!u.isEmpty()) {
                if (usuario.getIdUsuario() != null) {
                    u.get().setIdUsuario(usuario.getIdUsuario());
                }
                if (usuario.getName() != null) {
                    u.get().setName(usuario.getName());
                }
                if (usuario.getEmail() != null) {
                    u.get().setEmail(usuario.getEmail());
                }
                if (usuario.getContraseña() != null) {
                    u.get().setContraseña(usuario.getContraseña());
                }
                if (usuario.getDireccion() != null) {
                    u.get().setDireccion(usuario.getDireccion());
                }
                if (usuario.getEdad() != null) {
                    u.get().setEdad(usuario.getEdad());
                }
                if (usuario.getSexo() != null) {
                    u.get().setSexo(usuario.getSexo());
                }
                if (usuario.getOcupacion() != null) {
                    u.get().setOcupacion(usuario.getOcupacion());
                }
                if (usuario.getLocalidad() != null) {
                    u.get().setLocalidad(usuario.getLocalidad());
                }
                u.get().setEstado(usuario.getEstado());
                u.get().setRol(usuario.getRol());
                usuarioRepositorio.guardar(u.get());
                return u.get();
            } else {
                return usuario;
            }
        } else {
            return usuario;
        }
    }

    public Usuario actualizarEstado(Usuario usuario) {
        if (usuario.getIdUsuario() != null) {
            Optional<Usuario> u = usuarioRepositorio.getUsuario(usuario.getIdUsuario());
            if (!u.isEmpty()) {
                if (usuario.getEstado() == "Activo") {
                    u.get().setEstado("Inactivo");
                } else {
                    u.get().setEstado("Activo");
                }
                usuarioRepositorio.guardar(u.get());
                return u.get();
            } else {
                return usuario;
            }
        } else {
            return usuario;
        }
    }

}
