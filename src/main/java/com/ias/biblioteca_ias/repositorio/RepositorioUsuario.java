package com.ias.biblioteca_ias.repositorio;

import com.ias.biblioteca_ias.model.Libro;
import com.ias.biblioteca_ias.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface RepositorioUsuario extends CrudRepository<Usuario, Long> {




}
