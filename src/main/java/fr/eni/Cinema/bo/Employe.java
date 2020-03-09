package fr.eni.Cinema.bo;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Employe extends Personne {
	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	private String statut;
	
	public Employe(String prenom, String login, String mdp, String statut) {
		super(prenom, login, mdp);
		this.statut = statut;
	}
}
