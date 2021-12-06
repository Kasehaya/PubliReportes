package com.usa.hackathon.controlador;

import com.usa.hackathon.modelo.Opinion;
import com.usa.hackathon.servicios.ServicioOpinion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/opinion")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class OpinionControlador {

    @Autowired
    private ServicioOpinion servicioOpinion;

    @GetMapping("/all")
    public List<Opinion> getAll() {
        return servicioOpinion.getAll();
    }

    @GetMapping("/{idOpinion}")
    public Optional<Opinion> getOpinion(@PathVariable("idOpinion") int idOpinion) {
        return servicioOpinion.getOpinion(idOpinion);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Opinion guardar(@RequestBody Opinion opinion) {
        return servicioOpinion.guardar(opinion);
    }

}
