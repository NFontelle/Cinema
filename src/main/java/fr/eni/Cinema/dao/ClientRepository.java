package fr.eni.Cinema.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.eni.Cinema.bo.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>{

	@Query("From Client c where c.id = :id")
	Client trouveParId(@Param("id") int id);

	@Query("From Client c where c.login = :login and c.mdp = :mdp")
	Client verifCnx(@Param("login") String login, @Param("mdp") String mdp);

}
