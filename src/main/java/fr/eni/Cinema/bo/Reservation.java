package fr.eni.Cinema.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unused")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReservation;
	private int nbResa;
	
	@ManyToOne
	@JoinColumn (name = "client_id")
	@JsonBackReference
	private Client reservationClient;
	
	@ManyToOne
	@JoinColumn(name = "seance_id")
	@JsonBackReference
	private Seance reservationSeance;
	

}
