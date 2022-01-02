package org.tickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tickets.entities.Ticket;


@Repository
public interface DaoTicket extends JpaRepository<Ticket, Long>{

}
