package com.ias.biblioteca_ias.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "libro")
public class Libro {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true, nullable = false )
    private long id;
    private String autor;
    private Date fechaPublicacion;
    private String nombreLibro;
    private int nVecesPrestada;


}
