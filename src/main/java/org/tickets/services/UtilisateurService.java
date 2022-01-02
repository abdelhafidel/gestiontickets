package org.tickets.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.dao.DaoUtilisateur;
import org.tickets.entities.Utilisateur;

@Service
public class UtilisateurService {

	@Autowired
	private DaoUtilisateur daoUtilisateur;

	public Utilisateur save(final Utilisateur entity) {
		return daoUtilisateur.save(entity);
	}

	public List<Utilisateur> findAll() {
		return daoUtilisateur.findAll();
	}

	public Utilisateur findById(Long id) {
		return daoUtilisateur.findById(id).get();
	}

	public boolean existsById(Long id) {
		return daoUtilisateur.existsById(id);
	}

	public void deleteById(Long id) {
		daoUtilisateur.deleteById(id);
	}
	
	
}
