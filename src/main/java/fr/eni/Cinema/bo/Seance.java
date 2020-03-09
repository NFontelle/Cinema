package fr.eni.Cinema.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSeance;
	private Double prixSeance;
	private Date heureDebut;
	
	@ManyToOne
	@JoinColumn(name = "salle_id")
	@JsonManagedReference
	private Salle salle;
	
	
	@OneToMany(mappedBy = "reservationSeance")
	@JsonManagedReference
	private List<Reservation> reservations = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn (name = "film_id")
	@JsonBackReference
	private Film film;

}
