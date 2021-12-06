package com.usa.hackathon.controlador;

import com.usa.hackathon.modelo.ParaderoRuta;
import com.usa.hackathon.servicios.ServicioParaderoRuta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/paraderoruta")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ParaderoRutaControlador {

    @Autowired
    private ServicioParaderoRuta servicioParaderoRuta;

    @GetMapping("/all")
    public List<ParaderoRuta> getParaderoRutas() {
        return servicioParaderoRuta.getParaderoRutas();
    }

    @GetMapping("/{idParaderoRuta}")
    public Optional<ParaderoRuta> getParaderoRuta(@PathVariable("idParaderoRuta") int idParaderoRuta) {
        return servicioParaderoRuta.getParaderoRuta(idParaderoRuta);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ParaderoRuta guardarParaderoRuta(@RequestBody ParaderoRuta paraderoRuta) {
        return servicioParaderoRuta.guardarParaderoRuta(paraderoRuta);
    }

}
