package com.ias.biblioteca_ias.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "usuario")
public class Usuario  {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, length = 15)
    private long id;
    private String cedula;
    private String nombre;
    private Date fechaNacimiento;
}
