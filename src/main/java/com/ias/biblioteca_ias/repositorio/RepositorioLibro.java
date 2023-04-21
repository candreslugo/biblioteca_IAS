package com.ias.biblioteca_ias.repositorio;

import com.ias.biblioteca_ias.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface RepositorioLibro extends JpaRepository<Libro,Long> {


}
