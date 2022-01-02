package org.tickets.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.dao.DaoManager;
import org.tickets.entities.Manager;

@Service
public class ManagerService {
	
	@Autowired
	private DaoManager daoManager;

	public Manager save(Manager entity) {
		return daoManager.save(entity);
	}
	
	public Manager modify(Manager entity) {
		return daoManager.save(entity);
	}

	public List<Manager> findAll() {
		return daoManager.findAll();
	}

	public Manager findById(Long id) {
		return daoManager.findById(id).get();
	}

	public void deleteById(Long id) {
		daoManager.deleteById(id);
	}

	
	
	

}
