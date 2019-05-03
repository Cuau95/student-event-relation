package com.example.student.event.relation.domain.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evento_alumno")
public class StudentEventRelationEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEventoAlumno;
    @Column(name = "id_alumno")
    private String alumno;
    @Column(name = "id_evento")
    private int eventoFeriaEmpleo;

    public int getIdEventoAlumno() {
        return idEventoAlumno;
    }

    public void setIdEventoAlumno(int idEventoAlumno) {
        this.idEventoAlumno = idEventoAlumno;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public int getEventoFeriaEmpleo() {
        return eventoFeriaEmpleo;
    }

    public void setEventoFeriaEmpleo(int eventoFeriaEmpleo) {
        this.eventoFeriaEmpleo = eventoFeriaEmpleo;
    }
    
}
