package com.ias.biblioteca_ias.servicio;


import com.ias.biblioteca_ias.model.Libro;
import com.ias.biblioteca_ias.repositorio.RepositorioLibroPrestado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
public class ServicioLibroPrestado {

    @Autowired
    RepositorioLibroPrestado repositorioLibroPrestado;

    @Transactional(readOnly = true)
    public Optional<Libro> LibrosPrestados(Long id) {
        return repositorioLibroPrestado.librosPrestados(id);
    }

  /*  @Transactional(readOnly = true)
    public Optional<Libro> finByLibrosPrestados(String librosPrestados) {
        return repositorioLibroPrestado.finBylibrosPrestados(librosPrestados);
    }*/



}
