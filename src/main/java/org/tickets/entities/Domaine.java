package org.tickets.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Domaine {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;    
    @OneToMany(mappedBy = "domaine")
    private List<Ticket> tickets;
	
    public Domaine() {
		super();
	}

	public Domaine(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public Domaine(String nom) {
		super();
		this.nom = nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	@Override
	public String toString() {
		return "Domaine [id=" + id + ", nom=" + nom + ", tickets=" + tickets + "]";
	}
	
}
