package org.tickets.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.dao.DaoTicket;
import org.tickets.entities.Employe;
import org.tickets.entities.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private DaoTicket daoTicket;

	public Ticket save(Ticket entity) {
		return daoTicket.save(entity);
	}
	
	public Ticket modify(Ticket entity) {
		return daoTicket.save(entity);
	}

	public List<Ticket> findAll() {
		return daoTicket.findAll();
	}

	public Ticket findById(Long id) {
		return daoTicket.findById(id).get();
	}

	public boolean existsById(Long id) {
		return daoTicket.existsById(id);
	}

	public void deleteById(Long id) {
		daoTicket.deleteById(id);
	}
	
	

}
