package org.tickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tickets.entities.Domaine;

@Repository
public interface DaoDomain extends JpaRepository<Domaine, Long> {

}
