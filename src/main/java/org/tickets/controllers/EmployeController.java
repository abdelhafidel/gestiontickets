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
import org.tickets.entities.Employe;
import org.tickets.services.EmployeService;

@RestController
@RequestMapping("/employe")
public class EmployeController {
	
	@Autowired
	private EmployeService employeService;

	@PostMapping(path = "/addEmploye")
	public Employe save(@RequestBody Employe entity) {
		return employeService.save(entity);
	}
	
	@PutMapping(path = "/mdfEmploye")
	public Employe modify(@RequestBody Employe entity) {
		return employeService.save(entity);
	}

	@GetMapping(path = "/getEmployes")
	public List<Employe> findAll() {
		return employeService.findAll();
	}
	
	
	@GetMapping(path = "/getEmploye/{id}")
	public Employe findById(@PathVariable(value = "id") Long id) {
		return employeService.findById(id);
	}
	
	@GetMapping(path = "/chickEmploye/{id}")
	public boolean existsById(@PathVariable(value = "id") Long id) {
		return employeService.existsById(id);
	}

	@DeleteMapping(path = "/deleteEmploye/{id}")
	public void deleteById(@PathVariable(value = "id") Long id) {
		employeService.deleteById(id);
	}
	
	

}
