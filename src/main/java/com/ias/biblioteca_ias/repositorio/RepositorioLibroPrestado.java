package com.ias.biblioteca_ias.repositorio;

import com.ias.biblioteca_ias.model.Libro;
import com.ias.biblioteca_ias.model.LibroPrestado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface RepositorioLibroPrestado extends CrudRepository<LibroPrestado,Long> {

  public abstract ArrayList<Libro> finBylibrosPrestados(String librosPrestados);
    Optional<Libro> librosPrestados(Long id);

}
