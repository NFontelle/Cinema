package fr.eni.Cinema.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // FAIT LES GETTERS ET SETTERS
@NoArgsConstructor
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@SessionScope
public abstract class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(length = 40)
	private String prenom;
	@Column(length = 40)
	private String login;
	@Column(length = 50)
	private String mdp;
	
	public Personne(String prenom, String login, String mdp) {
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
	}		
	
}
