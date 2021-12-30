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

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", titre=" + titre + ", description=" + description + ", priorite=" + priorite
				+ ", etat_ticket=" + etat_ticket + ", domaine=" + domaine + "]";
	}
    

}
