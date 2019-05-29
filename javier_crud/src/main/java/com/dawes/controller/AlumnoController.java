package com.dawes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.AlumnoCursoVO;
import com.dawes.modelo.AlumnoVO;
import com.dawes.modelo.CursoVO;
import com.dawes.servicios.ServicioAlumno;
import com.dawes.servicios.ServicioCurso;

@Controller
@RequestMapping("alumno")
public class AlumnoController {
	@Autowired
	ServicioAlumno sa;
	@Autowired
	ServicioCurso sc;
	@RequestMapping("/lista")
	public String lista(Model modelo) {
		modelo.addAttribute("lista", sa.findAll());
		return "lista";
	}
	@RequestMapping("/formInserta")
	public String formInserta(Model modelo) {
		modelo.addAttribute("alumno",new AlumnoVO());
		return "formInsertaAlumno";
	}
	@RequestMapping("/inserta")
	public String inserta(@ModelAttribute AlumnoVO alumno, Model modelo) {
		sa.save(alumno);
		modelo.addAttribute("lista",sa.findAll());
		return "lista";
	}
	@RequestMapping("/eliminaAlumno")
	public String elimina(@RequestParam int idalumno, Model modelo) {
		sa.delete(sa.findById(idalumno).get());
		modelo.addAttribute("lista",sa.findAll());
		return "lista";
	}
	@RequestMapping("/modificaAlumno")
	public String modifica(@RequestParam int idalumno, Model modelo) {
		modelo.addAttribute("alumno",sa.findById(idalumno).get());
		return "formModificaAlumno";
	}
	
	@RequestMapping("/guardaAlumno")
	public String guarda(@ModelAttribute AlumnoVO alumno, Model modelo) {
		sa.save(sa.findById(alumno.getIdalumno()).get());
		modelo.addAttribute("lista",sa.findAll());
		return "lista";
	}
	@RequestMapping("/matriculaAlumno")
	public String matricula(@RequestParam int idalumno, Model modelo) {
		modelo.addAttribute("lista", sc.findAll());
		modelo.addAttribute("curso",new CursoVO());
		modelo.addAttribute("alumno",sa.findById(idalumno).get());
		return "formMatriculaAlumno";
	}
	@RequestMapping("/guardaMatricula")
	public String guardaMat(@ModelAttribute AlumnoVO alumno,@ModelAttribute CursoVO curso, Model modelo) {
		AlumnoCursoVO mat= new AlumnoCursoVO();
		mat.setAlumno(sa.findById(alumno.getIdalumno()).get());
		mat.setCurso(sc.findById(curso.getIdcurso()).get());
		sc.findById(curso.getIdcurso()).get().addAlumno(mat);
		sa.findById(alumno.getIdalumno()).get().addCurso(mat);;
		sc.save(sc.findById(curso.getIdcurso()).get());
		sa.save(sa.findById(alumno.getIdalumno()).get());
		modelo.addAttribute("lista",sa.findAll());
		return "lista";
	}
}
