package com.micropotro.Proyecto_ABCC_MySQL.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//insert into alumno_model(num_control, nombre, primer_ap, segundo_ap, fecha_nac, semestre, carrera) values('22880088', 'ras', 'acro', 'bacian', '1111-11-11', 8, 'LA');

@Entity
public class AlumnoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String num_control;
    private String nombre;
    private String primer_ap;
    private String segundo_ap;
    private String fecha_nac;
    private Byte semestre;
    private String carrera;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNum_control() {
        return num_control;
    }
    public void setNum_control(String num_control) {
        this.num_control = num_control;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimer_ap() {
        return primer_ap;
    }
    public void setPrimer_ap(String primer_ap) {
        this.primer_ap = primer_ap;
    }
    public String getSegundo_ap() {
        return segundo_ap;
    }
    public void setSegundo_ap(String segundo_ap) {
        this.segundo_ap = segundo_ap;
    }
    public String getFecha_nac() {
        return fecha_nac;
    }
    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    public Byte getSemestre() {
        return semestre;
    }
    public void setSemestre(Byte semestre) {
        this.semestre = semestre;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
