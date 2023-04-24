package com.ias.biblioteca_ias.servicio;

import com.ias.biblioteca_ias.model.Libro;
import com.ias.biblioteca_ias.model.Usuario;
import com.ias.biblioteca_ias.repositorio.RepositorioLibro;
import com.ias.biblioteca_ias.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

public class ServicioPersona {

    @Autowired
    RepositorioUsuario repositorioUsuario;


    @Transactional(readOnly = true)
    public ArrayList<Usuario> ObtenerUsuario() {
        return (ArrayList<Usuario>)  repositorioUsuario.findAll();
    }
    @Transactional
    public Usuario guardarUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    @Transactional
    public Usuario buscarUsuario(Usuario usuario) {
        return repositorioUsuario.findById(usuario.getId()).orElse(null);
    }

    @Transactional
    public boolean eliminarUsuario(Long id) {
       try {
           repositorioUsuario.delete(id);
           return true;
       }catch (Exception err){
           return false;
       }
    }

}
