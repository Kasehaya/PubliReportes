package com.usa.hackathon.controlador;

import com.usa.hackathon.modelo.OpinionUsuarios;
import com.usa.hackathon.servicios.ServicioOpinionUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class OpinionUsuarioControlador {

    @Autowired
    private ServicioOpinionUsuario servicioOpinionUsuario;

    @GetMapping("/all")
    public List<OpinionUsuarios> getAll() {
        return servicioOpinionUsuario.getAll();
    }

    @GetMapping("/{idOpinionUsuario}")
    public List<OpinionUsuarios> getOpinionUsuario(@PathVariable("idOpinionUsuario") int idOpinionUsuario) {
        return servicioOpinionUsuario.getOpinionUsuarios(idOpinionUsuario);
    }


    //@PostMapping("/save")
    //public OpinionUsuarios guardarOpinionUsuario(@RequestBody OpinionUsuarios opinionUsuarios) {
    //    return servicioOpinionUsuario.getOpinionUsuarios();
    //}

}
