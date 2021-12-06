package com.usa.hackathon.controlador;

import com.usa.hackathon.modelo.OpinionCompleta;
import com.usa.hackathon.modelo.OpinionUsuarios;
import com.usa.hackathon.servicios.ServicioOpinionUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/opinionusuarios")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class OpinionUsuarioControlador {

    @Autowired
    private ServicioOpinionUsuario servicioOpinionUsuario;

    @GetMapping("/all")
    public List<OpinionCompleta> getAll() {
        return servicioOpinionUsuario.getAll();
    }

    @GetMapping("/{idOpinionUsuario}")
    public List<OpinionCompleta> getOpinionUsuario(@PathVariable("idOpinionUsuario") int idOpinionUsuario) {
        return servicioOpinionUsuario.getOpinionUsuarios(idOpinionUsuario);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public OpinionCompleta guardarOpiniones(@RequestBody OpinionCompleta opinionCompleta) {
        return servicioOpinionUsuario.guardarOpinion(opinionCompleta);
    }

}
