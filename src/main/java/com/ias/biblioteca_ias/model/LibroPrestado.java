package com.ias.biblioteca_ias.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "libroPrestamo")
@Data
public class LibroPrestado {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true, nullable = false )
    private long id;
    private String librosPrestados;


}
