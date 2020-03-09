package fr.eni.Cinema.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.Cinema.bll.ClientManager;
import fr.eni.Cinema.bo.Client;
import fr.eni.Cinema.bo.Reservation;

@RestController
public class ClientController {

	@Autowired
	ClientManager clientManager;
	
	@CrossOrigin
	@RequestMapping(path = "/liste_clients", method = RequestMethod.GET)
	public List<Client> listeClients(){
		List<Client> clients =clientManager.read();
		return clients;
	}
	
	@RequestMapping(path = "/client/{id}", method = RequestMethod.GET)
	public Client client(@PathVariable("id") int id) {
		Client client = clientManager.select(id);
		return client;
	}
	
	@RequestMapping(path = "/client/reservation/{id}", method = RequestMethod.GET)
	public List<Reservation> listeResaClient(@PathVariable("id") int id){
		Client client = clientManager.select(id);
		return client.getReservations();
	}
	
	
	
}
