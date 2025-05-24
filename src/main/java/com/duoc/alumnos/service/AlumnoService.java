package com.duoc.alumnos.service;


import com.duoc.alumnos.model.Alumno;
import com.duoc.alumnos.repository.AlumnoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AlumnoService {
    @Autowired
    public AlumnoRepository alumnoRepository;
    //Traer a todos los alumnos registrados
    public List<Alumno> findAll() {
        return alumnoRepository.findAll();
    }
    //Traer un alumnos consultado
    public Alumno findById(int id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    public void delete(Integer id) {
        alumnoRepository.deleteById(id);
    }
    public Alumno findByCorreo(String correo) {
        return alumnoRepository.findByCorreo(correo);
    }
    public List<Alumno> findByNombres(String nombre) {
        return alumnoRepository.findByNombres(nombre);
    }

    public Alumno save(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }
}
