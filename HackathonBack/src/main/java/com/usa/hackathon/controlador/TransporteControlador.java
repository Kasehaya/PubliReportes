package com.usa.hackathon.controlador;

import com.usa.hackathon.modelo.Transporte;
import com.usa.hackathon.servicios.ServicioTransporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.dsig.TransformService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transporte")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class TransporteControlador {

    @Autowired
    private ServicioTransporte servicioTransporte;

    @GetMapping("/all")
    public List<Transporte> getTransportes() {
        return servicioTransporte.getTransportes();
    }

    @GetMapping("/{idTransporte}")
    public Optional<Transporte> getTransporte(@PathVariable("idTransporte") int idTransporte) {
        return servicioTransporte.getTransporte(idTransporte);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Transporte guardarTransporte(@RequestBody Transporte transporte) {
        return servicioTransporte.guardarTransporte(transporte);
    }

}
