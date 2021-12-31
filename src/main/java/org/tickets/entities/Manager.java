package org.tickets.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("manager")
public class Manager extends Utilisateur {

	private String departement;
	private String codeService;

	public Manager(Long id_utilisateur, String nom, String prenom, String mail, String telephone, String login,
			String password, String departement, String codeService) {
		super(id_utilisateur, nom, prenom, mail, telephone, login, password);
		this.departement = departement;
		this.codeService = codeService;
	}

	public Manager() {
		super();
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getCodeService() {
		return codeService;
	}

	public void setCodeService(String codeService) {
		this.codeService = codeService;
	}

}
