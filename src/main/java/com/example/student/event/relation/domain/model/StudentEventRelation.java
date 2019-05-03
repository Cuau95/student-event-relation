package com.example.student.event.relation.domain.model;

public class StudentEventRelation {
    
    private int idEventoAlumno;
    private Student alumno;
    private Event eventoFeriaEmpleo;

    public int getIdEventoAlumno() {
        return idEventoAlumno;
    }

    public void setIdEventoAlumno(int idEventoAlumno) {
        this.idEventoAlumno = idEventoAlumno;
    }

    public Student getAlumno() {
        return alumno;
    }

    public void setAlumno(Student alumno) {
        this.alumno = alumno;
    }

    public Event getEventoFeriaEmpleo() {
        return eventoFeriaEmpleo;
    }

    public void setEventoFeriaEmpleo(Event eventoFeriaEmpleo) {
        this.eventoFeriaEmpleo = eventoFeriaEmpleo;
    }
    
}
