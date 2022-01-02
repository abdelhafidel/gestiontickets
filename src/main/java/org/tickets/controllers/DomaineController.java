package org.tickets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tickets.entities.Domaine;
import org.tickets.services.DomaineService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("gestionTickets/domaine")
public class DomaineController {
	
	@Autowired
	private DomaineService domaineService;

	@ApiOperation("add domaine")
    @PostMapping("/addDomaine")
    public Domaine save(Domaine entity) {
		return domaineService.save(entity);
	}
	
	@ApiOperation("update domaine")
    @PutMapping("/updateDomaine")
    public Domaine update(Domaine entity) {
		return domaineService.save(entity);
	}

    @ApiOperation("List of domaines")
    @GetMapping("/listDomaine")
	public List<Domaine> findAll() {
		return domaineService.findAll();
	}

    @ApiOperation("Find domaine")
    @GetMapping("idDom/{id}")
	public Domaine findById(@PathVariable Long id) {
		return domaineService.findById(id);
	}
	
	@ApiOperation("delete domaine")
	@DeleteMapping("idDomaine/{id}")
	public void deleteById(@PathVariable Long id) {
		domaineService.deleteById(id);
	}

	public Domaine getById(Long id) {
		return domaineService.getById(id);
	}
	

}
