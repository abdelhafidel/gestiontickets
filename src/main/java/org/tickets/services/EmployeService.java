package org.tickets.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.dao.DaoEmploye;
import org.tickets.entities.Employe;

@Service
public class EmployeService {

	@Autowired
	private DaoEmploye daoEmploye;

	public Employe save(Employe entity) {
		return daoEmploye.save(entity);
	}

	public Employe modify(Employe entity) {
		return daoEmploye.save(entity);
	}

	public Employe findById(Long id) {
		return daoEmploye.findById(id).get();
	}

	public boolean existsById(Long id) {
		return daoEmploye.existsById(id);
	}

	public void deleteById(Long id) {
		daoEmploye.deleteById(id);
	}

	public List<Employe> findAll() {
		return daoEmploye.findAll();
	}

}
