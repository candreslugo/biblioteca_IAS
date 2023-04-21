package com.ias.biblioteca_ias.servicio;

import com.ias.biblioteca_ias.model.Libro;
import com.ias.biblioteca_ias.repositorio.RepositorioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceLibro {
    @Autowired
    RepositorioLibro repositorioLibro;

    public void crearLibro(Libro libro) {
        repositorioLibro.save(libro);
    }
}
