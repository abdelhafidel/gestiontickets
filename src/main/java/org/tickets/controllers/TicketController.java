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
import org.tickets.entities.Ticket;
import org.tickets.services.TicketService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;

	@ApiOperation("add ticket")
    @PostMapping(path = "/addTicket")
	public Ticket save(Ticket entity) {
		return ticketService.save(entity);
	}
	
	@ApiOperation("update ticket")
    @PutMapping(path = "/mdfTicket")
    public Ticket update(Ticket entity) {
		return ticketService.save(entity);
	}

	@ApiOperation("List of tickets")
    @GetMapping(path = "/getTicket")
	public List<Ticket> findAll() {
		return ticketService.findAll();
	}

	@ApiOperation("Find tickets")
	@GetMapping(path = "/getTicket/{id}")
	public Ticket findById(@PathVariable Long id) {
		return ticketService.findById(id);
	}

	@GetMapping(path = "/chickTicket/{id}")
	public boolean existsById(@PathVariable Long id) {
		return ticketService.existsById(id);
	}
	
	@ApiOperation("delete ticket")
	@DeleteMapping(path = "/deleteTicket/{id}")
	public void deleteById(@PathVariable Long id) {
		ticketService.deleteById(id);
	}
	
	

}
