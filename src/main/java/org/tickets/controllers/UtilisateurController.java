package org.tickets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tickets.entities.Utilisateur;
import org.tickets.services.UtilisateurService;

@RestController
@RequestMapping("/user")
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService utilisateurService;

	@PostMapping(path = "/addUser")
	public Utilisateur save(@RequestBody Utilisateur entity) {
		return utilisateurService.save(entity);
	}
	
	@PutMapping(path = "/mdfUser")
	public Utilisateur modify(@RequestBody Utilisateur entity) {
		return utilisateurService.save(entity);
	}

	@GetMapping(path = "/getUsers")
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}
	
	
	@GetMapping(path = "/getUser/{id}")
	public Utilisateur findById(@PathVariable(value = "id") Long id) {
		return utilisateurService.findById(id);
	}
	
	@GetMapping(path = "/chickUser/{id}")
	public boolean existsById(@PathVariable(value = "id") Long id) {
		return utilisateurService.existsById(id);
	}

	@DeleteMapping(path = "/deleteUser/{id}")
	public void deleteById(@PathVariable(value = "id") Long id) {
		utilisateurService.deleteById(id);
	}
	
	

}
