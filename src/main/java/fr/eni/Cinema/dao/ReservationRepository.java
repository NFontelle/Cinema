package fr.eni.Cinema.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.eni.Cinema.bo.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Integer>{

	@Query("From Reservation r where r.id = :id")
	Reservation trouveParId(@Param("id") int id);

}
