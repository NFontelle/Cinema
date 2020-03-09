package fr.eni.Cinema.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.eni.Cinema.bo.Seance;

public interface SeanceRepository extends CrudRepository<Seance, Integer> {

	@Query("From Seance s where s.id = :id")
	Seance trouveParId(@Param("id") int id);

}
