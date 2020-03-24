package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Protein;
import com.example.demo.service.ProteinService;

@Controller
public class MainController {

	@Autowired
	private ProteinService proteinServ;
	/**
	 * Insertion page controller
	 * @param model
	 * @return
	 */
	@GetMapping("/create")
	public String showFrom(Model model) {
		model.addAttribute("protein", new Protein());
		return "createProtein";
	}
	
	/**
	 * Update page controller
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("/update/{id}")
	public String showUpdateForm(@PathVariable("id")Long id, Model model) {
		Protein protein = proteinServ.findById(id);
		model.addAttribute("protein", protein);
		return "createProtein";
	}
	
	/**
	 * Delete page controller
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("/delete/{id}")
	public String deleteProtein(@PathVariable("id")Long id, Model model) {
		proteinServ.delete(id);
		return "redirect:/";
	}
	
	/**
	 * Main page controller
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String index(Model model) {
		List<Protein> proteinsList = proteinServ.findAll();
		model.addAttribute("proteins", proteinsList);
		return "index";
	}
	
	@PostMapping("/submit")
	public String saveProtein(@ModelAttribute("protein") Protein protein, Model model) {
		proteinServ.save(protein);
		return "redirect:/";
	}

}
