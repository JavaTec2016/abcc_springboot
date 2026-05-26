package com.micropotro.Proyecto_ABCC_MySQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.micropotro.Proyecto_ABCC_MySQL.models.AlumnoModel;
import com.micropotro.Proyecto_ABCC_MySQL.services.AlumnoService;

@Controller
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;



    @GetMapping("/")
    public String ListAlumnos(Model model){
        List<AlumnoModel> listaAlumnos = alumnoService.findAllAlumnos();
        model.addAttribute("alumnos", listaAlumnos);
        return "list";
    }

    @GetMapping("/subes")
    public String showAlumnoForm(Model model){
        AlumnoModel alumno = new AlumnoModel();
        model.addAttribute("alumno", alumno);
        return "nuevo_alumno";
    }
    @PostMapping("/guardar")
    public String subirAlumno(@ModelAttribute("alumno") AlumnoModel alumno){
        alumnoService.saveAlumno(alumno);
        return "redirect:/";
    }
    @GetMapping("/actualizar/{id}")
    public String showAlumnoFormUpdate(@PathVariable(value = "id") Integer id, Model model){
        AlumnoModel alumno = alumnoService.getAlumnoById(id);
        model.addAttribute("alumno", alumno);
        return "actualizar_alumno";
    }
    @GetMapping("/detalles/{id}")
    public String detalleAlumno(@PathVariable(value = "id") Integer id, Model model){
        AlumnoModel alumno = alumnoService.getAlumnoById(id);
        model.addAttribute("alumno", alumno);
        return "detalle_alumno";
    }
    @GetMapping("/bajas/{id}")
    public String deleteAlumno(@PathVariable(value = "id") Integer id){
        alumnoService.deleteAlumnoById(id);
        return "redirect:/";
    }
    @GetMapping("/error")
    public String error(){
        return "noSistema";
    }
}
