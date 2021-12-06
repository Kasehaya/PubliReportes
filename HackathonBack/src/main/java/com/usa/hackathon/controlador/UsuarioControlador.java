package com.usa.hackathon.controlador;


import com.usa.hackathon.modelo.Usuario;
import com.usa.hackathon.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UsuarioControlador {

    @Autowired
    private ServicioUsuario servicioUsuario;

    @GetMapping("/all")
    public List<Usuario> getAll() {
        return servicioUsuario.getAll();
    }

    @GetMapping("/{idUsuario}")
    public Optional<Usuario> getUsuario(@PathVariable("idUsuario") int idUsuario) {
        return servicioUsuario.getUsuario(idUsuario);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario guardar(@RequestBody Usuario usuario) {
        return servicioUsuario.guardar(usuario);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario actualizar(@RequestBody Usuario usuario) {
        return servicioUsuario.actualizar(usuario);
    }

    @PutMapping("/updateestado")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario actualizarEstado(@RequestBody Usuario usuario) {
        return servicioUsuario.actualizarEstado(usuario);
    }

}
