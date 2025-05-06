package com.duoc.alumnos.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="matriculas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matricula{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(nullable = false, unique = false)
    public Date fecha;

    @Column(nullable = false, unique = false)
    public Integer alumnoId;

    @Column(nullable = false, unique = false)
    public Integer carrerasId;

}
