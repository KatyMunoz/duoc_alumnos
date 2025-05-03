package com.duoc.alumnos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alumnos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(nullable = false, unique = true, length = 50)
    public String rut;

    @Column(nullable = false, unique = false, length = 50)
    public String nombres;

    @Column(nullable = false, unique = false, length = 50)
    public String apellidos;

    @Column(nullable = false, unique = true, length = 50)
    public String correo;
}