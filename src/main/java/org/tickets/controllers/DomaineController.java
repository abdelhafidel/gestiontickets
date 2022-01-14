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
@RequestMapping("/domaine")
public class DomaineController {
	
	@Autowired
	private DomaineService domaineService;

	@ApiOperation("add domaine")
    @PostMapping(path = "/addDomaine")
    public Domaine save(Domaine entity) {
		return domaineService.save(entity);
	}
	
	@ApiOperation("update domaine")
    @PutMapping(path = "/mdfDomaine")
    public Domaine update(Domaine entity) {
		return domaineService.save(entity);
	}

    @ApiOperation("List of domaines")
    @GetMapping(path = "/getDomaines")
	public List<Domaine> findAll() {
		return domaineService.findAll();
	}

    @ApiOperation("Find domaine")
    @GetMapping(path = "/getDomaine/{id}")
	public Domaine findById(@PathVariable Long id) {
		return domaineService.findById(id);
	}
    
    @GetMapping(path = "/chickDomaine/{id}")
	public boolean existsById(@PathVariable Long id) {
		return domaineService.existsById(id);
	}
	
	@ApiOperation("delete domaine")
	@DeleteMapping(path = "/deleteDomaine/{id}")
	public void deleteById(@PathVariable Long id) {
		domaineService.deleteById(id);
	}
	

}
