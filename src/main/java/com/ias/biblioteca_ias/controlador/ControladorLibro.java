package com.ias.biblioteca_ias.controlador;

import com.ias.biblioteca_ias.model.Libro;
import com.ias.biblioteca_ias.servicio.ServiceLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorLibro {

    @Autowired
    ServiceLibro serviceLibro;

    @PostMapping("/libro")
    public void crearLibro(@RequestBody Libro libro){
        serviceLibro.crearLibro(libro);
    }

}
