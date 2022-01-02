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
@RequestMapping("gestionTickets/ticket")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;

	@ApiOperation("add ticket")
    @PostMapping("/addticket")
	public Ticket save(Ticket entity) {
		return ticketService.save(entity);
	}
	
	@ApiOperation("update ticket")
    @PutMapping("/updateTicket")
    public Ticket update(Ticket entity) {
		return ticketService.save(entity);
	}

	@ApiOperation("List of tickets")
    @GetMapping("/list")
	public List<Ticket> findAll() {
		return ticketService.findAll();
	}

	@ApiOperation("Find tickets")
	@GetMapping("id/{id}")
	public Ticket findById(@PathVariable Long id) {
		return ticketService.findById(id);
	}

	public boolean existsById(Long id) {
		return ticketService.existsById(id);
	}
	
	@ApiOperation("delete ticket")
	@DeleteMapping("idTicket/{id}")
	public void deleteById(@PathVariable Long id) {
		ticketService.deleteById(id);
	}
	
	

}
