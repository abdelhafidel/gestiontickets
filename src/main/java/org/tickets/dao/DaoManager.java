package org.tickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tickets.entities.Manager;

@Repository
public interface DaoManager extends JpaRepository<Manager, Long> {

}
