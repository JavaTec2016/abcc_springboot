package com.micropotro.Proyecto_ABCC_MySQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micropotro.Proyecto_ABCC_MySQL.models.AlumnoModel;

public interface AlumnoRepository extends JpaRepository<AlumnoModel, Integer>{
    
}
