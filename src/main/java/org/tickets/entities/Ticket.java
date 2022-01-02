package org.tickets.entities;


import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String priorite;
    private Boolean etat_ticket;
    @ManyToOne
    @JoinColumn(name = "id_domaine")
    private Domaine domaine;
    

    @ManyToOne
    @JoinColumn(name = "id_manager")
    private Manager manager;
    
    @ManyToOne
    @JoinColumn(name = "id_employe")
    private Employe employe;
    
    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;
    


	public Ticket() {
		super();
	}

	public Ticket(Long id, String titre, String description, String priorite, Boolean etat_ticket) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.priorite = priorite;
		this.etat_ticket = etat_ticket;
	}

	public Ticket(String titre, String description, String priorite, Boolean etat_ticket) {
		super();
		this.titre = titre;
		this.description = description;
		this.priorite = priorite;
		this.etat_ticket = etat_ticket;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriorite() {
		return priorite;
	}

	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}

	public Boolean getEtat_ticket() {
		return etat_ticket;
	}

	public void setEtat_ticket(Boolean etat_ticket) {
		this.etat_ticket = etat_ticket;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


}
