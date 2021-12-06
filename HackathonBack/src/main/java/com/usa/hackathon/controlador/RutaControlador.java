package com.usa.hackathon.controlador;

import com.usa.hackathon.modelo.Ruta;
import com.usa.hackathon.servicios.ServicioRuta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ruta")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class RutaControlador {

    @Autowired
    private ServicioRuta servicioRuta;

    @GetMapping("/all")
    public List<Ruta> getRutas() {
        return servicioRuta.getRutas();
    }

    @GetMapping("/{idRuta}")
    public Optional<Ruta> getRuta(@PathVariable("idRuta") int idRuta) {
        return servicioRuta.getRuta(idRuta);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Ruta guardarRuta(@RequestBody Ruta ruta) {
        return servicioRuta.guardarRuta(ruta);
    }

}
