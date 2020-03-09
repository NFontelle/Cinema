package fr.eni.Cinema.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.eni.Cinema.bo.Salle;

public interface SalleRepository extends CrudRepository<Salle, Integer>{

	@Query("From Salle s where s.id= :id")
	Salle trouveParId(@Param("id") int id);

	
	
	

}
