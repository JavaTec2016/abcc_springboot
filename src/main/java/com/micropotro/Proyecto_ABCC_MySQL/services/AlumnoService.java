package com.micropotro.Proyecto_ABCC_MySQL.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micropotro.Proyecto_ABCC_MySQL.models.AlumnoModel;
import com.micropotro.Proyecto_ABCC_MySQL.repositories.AlumnoRepository;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public void saveAlumno(AlumnoModel alumno){
        this.alumnoRepository.save(alumno);
    }

    public AlumnoModel getAlumnoById(Integer id){
        Optional <AlumnoModel> optional = alumnoRepository.findById(id);
        AlumnoModel alumno = null;
        if(optional.isPresent()){
            alumno = optional.get();
        }else throw new RuntimeException("Alumno no encontrado. ID: " + id);
        return alumno;
    }
    public void deleteAlumnoById(Integer id){
        alumnoRepository.deleteById(id);
    }
    public List<AlumnoModel> findAllAlumnos(){
        return alumnoRepository.findAll();
    }
}
