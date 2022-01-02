package org.tickets.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Manager{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_manager;
	private String nom;
	private String prenom;
	private String mail;
	private String telephone;
	private String login;
	private String password;
	private String departement;
	private String codeService;



	public Manager(Long id_manager, String nom, String prenom, String mail, String telephone, String login,
			String password, String departement, String codeService) {
		super();
		this.id_manager = id_manager;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = telephone;
		this.login = login;
		this.password = password;
	}
	
	@OneToMany(mappedBy = "manager")
	private List<Ticket> tickets;
	
	public Long getId_manager() {
		return id_manager;
	}

	public void setId_manager(Long id_manager) {
		this.id_manager = id_manager;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
