package fr.eni.Cinema.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.eni.Cinema.bo.Film;

public interface FilmRepository extends CrudRepository<Film, Integer> {

	@Query("From Film f where f.id = :id")
	Film trouveParId(@Param("id") int id);

}
