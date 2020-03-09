package fr.eni.Cinema.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFilm;
	@Column(length = 40)
	private String nom;
	@Column(length = 40)
	private String realisateur;
	
	private int duree; //minutes
	private boolean _3d;
	
	@OneToMany(mappedBy = "film")
	@JsonManagedReference
	private List<Seance> seances = new ArrayList<>();
	
}
