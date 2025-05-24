package com.duoc.alumnos.repository;

import com.duoc.alumnos.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
    Alumno findByCorreo(String correo);

    List<Alumno> findByNombres(String nombre);
}
