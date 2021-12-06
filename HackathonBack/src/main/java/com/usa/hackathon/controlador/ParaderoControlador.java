package com.usa.hackathon.controlador;

import com.usa.hackathon.modelo.Paradero;
import com.usa.hackathon.servicios.ServicioParadero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/paradero")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ParaderoControlador {

    @Autowired
    private ServicioParadero servicioParadero;

    @GetMapping("/all")
    public List<Paradero> getParaderos() {
        return servicioParadero.getParaderos();
    }

    @GetMapping("/{idParadero}")
    public Optional<Paradero> getParadero(@PathVariable("idParadero") int idParadero) {
        return servicioParadero.getParadero(idParadero);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Paradero guardarParadero(@RequestBody Paradero paradero) {
        return servicioParadero.guardaParadero(paradero);
    }

}
