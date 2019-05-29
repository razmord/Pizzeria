package com.dawes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.CursoVO;
import com.dawes.servicios.ServicioCurso;

@Controller
@RequestMapping("curso")
public class CursoController {
	@Autowired
	ServicioCurso sc;
	@RequestMapping("/listaCurso")
	public String lista(Model modelo) {
		modelo.addAttribute("listaCurso", sc.findAll());
		return "listaCurso";
	}
	@RequestMapping("/formInsertaCurso")
	public String formInserta(Model modelo) {
		modelo.addAttribute("curso",new CursoVO());
		return "formInsertaCurso";
	}
	@RequestMapping("/insertaCurso")
	public String inserta(@ModelAttribute CursoVO curso, Model modelo) {
		sc.save(curso);
		modelo.addAttribute("listaCurso",sc.findAll());
		return "listaCurso";
	}
	@RequestMapping("/eliminaCurso")
	public String elimina(@RequestParam int idcurso, Model modelo) {
		sc.delete(sc.findById(idcurso).get());
		modelo.addAttribute("listaCurso",sc.findAll());
		return "listaCurso";
	}
	@RequestMapping("/modificaCurso")
	public String modifica(@RequestParam int idcurso, Model modelo) {
		modelo.addAttribute("curso",sc.findById(idcurso).get());
		return "formModificaCurso";
	}
	
	@RequestMapping("/guardaCurso")
	public String guarda(@ModelAttribute CursoVO curso, Model modelo) {
		sc.save(curso);
		modelo.addAttribute("listaCurso",sc.findAll());
		return "listaCurso";
	}
}
