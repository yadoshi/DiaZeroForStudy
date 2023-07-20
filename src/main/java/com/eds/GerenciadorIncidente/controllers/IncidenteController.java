package com.eds.GerenciadorIncidente.controllers;

import com.eds.GerenciadorIncidente.dao.IncidenteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eds.GerenciadorIncidente.entities.Incidente;

@Controller
public class IncidenteController {

	@Autowired
	private IncidenteDao incidenterepositorio;
	@GetMapping("/editarIncidente")
	public ModelAndView InserirIncidente(Incidente incidente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("incidente/editarIncidentes");
		mv.addObject("incidente", new Incidente());
		return mv;
	}

	@PostMapping("InsertIncidentes")
	public ModelAndView inserirAincidente(Incidente incidente){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/Incidente/listIncidentes");
		incidenterepositorio.save(incidente);
		return mv;
	}
}
