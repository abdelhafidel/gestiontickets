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
import org.tickets.entities.Manager;
import org.tickets.services.ManagerService;

@RestController
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;

	@PostMapping(path = "/addManager")
	public Manager save(@RequestBody Manager entity) {
		return managerService.save(entity);
	}
	
	@PutMapping(path = "/mdfManager")
	public Manager modify(@RequestBody Manager entity) {
		return managerService.save(entity);
	}

	@GetMapping(path = "/getManagers")
	public List<Manager> findAll() {
		return managerService.findAll();
	}
	
	
	@GetMapping(path = "/getManager/{id}")
	public Manager findById(@PathVariable(value = "id") Long id) {
		return managerService.findById(id);
	}
	
	@DeleteMapping(path = "/deleteManager/{id}")
	public void deleteById(@PathVariable(value = "id") Long id) {
		managerService.deleteById(id);
	}
	
	

}
