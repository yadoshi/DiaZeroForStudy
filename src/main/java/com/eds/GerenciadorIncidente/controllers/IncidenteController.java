package com.eds.GerenciadorIncidente.controllers;

import com.eds.GerenciadorIncidente.dao.IncidenteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ModelAndView inserirIncidente(Incidente incidente){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/incidentes-adicionados");
		incidenterepositorio.save(incidente);
		return mv;
	}

	@GetMapping("incidentes-adicionados")
	public ModelAndView listagemIncidentes(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("incidente/listIncidentes");
		mv.addObject("incidentesList", incidenterepositorio.findAll());
		return mv;
	}

	@GetMapping("/alterar/{id}")
	public ModelAndView alterar(@PathVariable("id") Integer id){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("incidente/alterar");
		Incidente incidente = incidenterepositorio.getOne(id);
		mv.addObject("incidente", incidente);
		return mv;
	}

	@PostMapping("/alterar")
	public ModelAndView alterar(Incidente incidente){
		ModelAndView mv = new ModelAndView();
		incidenterepositorio.save(incidente);
		mv.setViewName("redirect:/incidentes-adicionados");
		return mv;
	}

}
