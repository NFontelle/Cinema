package fr.eni.Cinema.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Client extends Personne {
	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getAdrMail() {
		return adrMail;
	}

	public void setAdrMail(String adrMail) {
		this.adrMail = adrMail;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Column(length = 40)
	private String nomClient;
	private String adrMail;
	@Column(length = 10)
	private String numTel;
	@Column(length = 40)
	
	@OneToMany (mappedBy = "reservationClient")
	@JsonManagedReference
	private List<Reservation> reservations = new ArrayList<>();
	
	public Client(String prenom, String login, String mdp, String nomClient, String adrMail, String numTel) {
		super(prenom, login, mdp);
		this.nomClient = nomClient;
		this.adrMail = adrMail;
		this.numTel = numTel;
		
	}

}
