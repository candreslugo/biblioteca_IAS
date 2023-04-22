package com.ias.biblioteca_ias.servicio;

import com.ias.biblioteca_ias.model.Libro;
import com.ias.biblioteca_ias.repositorio.RepositorioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServicioLibro {
    @Autowired
    RepositorioLibro repositorioLibro;


    @Transactional(readOnly = true)
    public ArrayList<Libro> ObtenerLibro() {
        return (ArrayList<Libro>)  repositorioLibro.findAll();
    }
    @Transactional
    public Libro guardarLibro(Libro libro) {
      return repositorioLibro.save(libro);
    }
    @Transactional
    public void eliminarLibro(Libro libro) {
        repositorioLibro.delete(libro);
    }

    @Transactional
    public Libro buscarLibro(Libro libro) {
        return repositorioLibro.findById(libro.getId()).orElse(null);
    }


}
