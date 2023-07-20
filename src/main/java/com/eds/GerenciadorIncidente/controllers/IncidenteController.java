package com.eds.GerenciadorIncidente.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eds.GerenciadorIncidente.entities.Incidente;

@Controller
public class IncidenteController {
	
	@GetMapping("/editarIncidente")
	public ModelAndView InserirIncidente(Incidente incidente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("incidente/editarIncidentes");
		mv.addObject("incidente", new Incidente());
		return mv;
	}
}
