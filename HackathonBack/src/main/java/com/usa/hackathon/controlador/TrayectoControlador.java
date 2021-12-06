package com.usa.hackathon.controlador;

import com.usa.hackathon.modelo.Trayecto;
import com.usa.hackathon.servicios.ServicioTrayecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/trayecto")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class TrayectoControlador {

    @Autowired
    private ServicioTrayecto servicioTrayecto;

    @GetMapping("/all")
    public List<Trayecto> getTrayectos() {
        return servicioTrayecto.getTrayectos();
    }

    @GetMapping("/{idTrayecto}")
    public Optional<Trayecto> getTrayecto(@PathVariable("idTrayecto") int idTrayecto) {
        return servicioTrayecto.getTrayecto(idTrayecto);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Trayecto guardarTrayecto(@RequestBody Trayecto trayecto) {
        return servicioTrayecto.guardarTrayecto(trayecto);
    }

}
