package com.ias.biblioteca_ias.controlador;

import com.ias.biblioteca_ias.model.Libro;
import com.ias.biblioteca_ias.servicio.ServicioLibro;
import com.ias.biblioteca_ias.servicio.ServicioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorLibro {

    @Autowired
    ServicioLibro serviceLibro;

    @GetMapping("/crear")
    public ArrayList<Libro> optenerLibro(){
      return (ArrayList<Libro>) serviceLibro.ObtenerLibro();
    }

    @PostMapping("/guardar")
    public Libro guardarLibro(@RequestBody Libro libro){
     return this.serviceLibro.guardarLibro(libro);

    }

}
