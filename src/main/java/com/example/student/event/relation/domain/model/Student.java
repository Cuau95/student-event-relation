package com.example.student.event.relation.domain.model;

import java.io.Serializable;

public class Student implements Serializable {

    private String idAlumno;
    private String nombreAlumno;
    private String pApellido;
    private String mApellido;
    private String nombreCompleto;
    private Campus escuela;
    private Career carrera;

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getmApellido() {
        return mApellido;
    }

    public void setmApellido(String mApellido) {
        this.mApellido = mApellido;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Campus getEscuela() {
        return escuela;
    }

    public void setEscuela(Campus escuela) {
        this.escuela = escuela;
    }

    public Career getCarrera() {
        return carrera;
    }

    public void setCarrera(Career carrera) {
        this.carrera = carrera;
    }

    public class Campus implements Serializable {

        private int idEscuela;
        private String nombreEscuela;
        
        public int getIdEscuela() {
            return idEscuela;
        }

        public void setIdEscuela(int idEscuela) {
            this.idEscuela = idEscuela;
        }

        public String getNombreEscuela() {
            return nombreEscuela;
        }

        public void setNombreEscuela(String nombreEscuela) {
            this.nombreEscuela = nombreEscuela;
        }
        
    }

    public class Career implements Serializable {

        private int idCarrera;
        private String nombreCarrera;

        public int getIdCarrera() {
            return idCarrera;
        }

        public void setIdCarrera(int idCarrera) {
            this.idCarrera = idCarrera;
        }

        public String getNombreCarrera() {
            return nombreCarrera;
        }

        public void setNombreCarrera(String nombreCarrera) {
            this.nombreCarrera = nombreCarrera;
        }
        
    }

}
