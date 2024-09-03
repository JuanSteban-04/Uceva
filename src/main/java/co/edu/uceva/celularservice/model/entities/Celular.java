package co.edu.uceva.celularservice.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/*
 * ORM: Object Relational Mapping
 * JPA: Java Persistence API (Especificación) -> Hibernate, EclipseLink, TopLink, OpenJPA, DataNucleus
 */

/**
 * La clase Celular es una entidad que se mapea con la tabla celular en la base de datos.
 */
@Data
@Entity
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private int capacidad;
    private String marca;
}