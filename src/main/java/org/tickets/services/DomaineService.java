package org.tickets.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.dao.DaoDomain;
import org.tickets.entities.Domaine;

@Service
public class DomaineService {

	@Autowired
	private DaoDomain daoDomain;

	public Domaine save(Domaine entity) {
		return daoDomain.save(entity);
	}

	public List<Domaine> findAll() {
		return daoDomain.findAll();
	}

	public Domaine findById(Long id) {
		return daoDomain.findById(id).get();
	}

	public void deleteById(Long id) {
		daoDomain.deleteById(id);
	}

	public boolean existsById(Long id) {
		return daoDomain.existsById(id);
	}
	

	
}
