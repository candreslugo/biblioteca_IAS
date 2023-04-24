package com.ias.biblioteca_ias.controlador;

import com.ias.biblioteca_ias.model.Libro;
import com.ias.biblioteca_ias.model.Usuario;
import com.ias.biblioteca_ias.servicio.ServicioLibro;
import com.ias.biblioteca_ias.servicio.ServicioLibroPrestado;
import com.ias.biblioteca_ias.servicio.ServicioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ControladorLibro {

    @Autowired
    ServicioLibro serviceLibro;
    @Autowired
    ServicioLibroPrestado servicioLibroPrestado;
    @Autowired
    ServicioPersona servicioPersona;

    @GetMapping("/buscarlibro")
    public ArrayList<Libro> optenerLibro(){
      return (ArrayList<Libro>) serviceLibro.ObtenerLibro();
    }

    @PostMapping("/guardarlibro")
    public Libro guardarLibro(@RequestBody Libro libro){
     return this.serviceLibro.guardarLibro(libro);
    }

    @DeleteMapping(path = "/{ideliminarlibro}")
    public  String eliminarLibro(@PathVariable("id") Long id) {
        boolean ok = this.serviceLibro.eliminarLibro(id);
        if (ok) {
            return "se elimino el libro con el id: " + id;
        }else {
            return "no se pudo eliminar el libro con el id: "+ id;
        }

    }

    @GetMapping( path = "/{idlibroPrestado}")
    public Optional<Libro> librosPrestados(@PathVariable("id") Long id){
        return this.servicioLibroPrestado.LibrosPrestados(id);
    }

    @GetMapping("/buscarusuario")
    public ArrayList<Usuario> optenerUsuario(){
        return (ArrayList<Usuario>) servicioPersona.ObtenerUsuario();
    }

    @PostMapping("/guardarusuario")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return this.servicioPersona.guardarUsuario(usuario);
    }

    @DeleteMapping(path = "/{ideliminarpersona}")
    public  String eliminarUsuario(@PathVariable("id") Long id) {
        boolean ok = this.servicioPersona.eliminarUsuario(id);
        if (ok) {
            return "se elimino la persona con el id: " + id;
        }else {
            return "no se pudo eliminar la persona con el id: "+ id;
        }

    }


}
