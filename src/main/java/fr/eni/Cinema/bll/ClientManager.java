package fr.eni.Cinema.bll;

import java.util.List;

import fr.eni.Cinema.bo.Client;
import fr.eni.Cinema.bo.Reservation;


public interface ClientManager {

	public void create(Client client);
	public List<Client> read();
	public void update(int id);
	public void delete(int id);
	public Client select(int id);
	
	public Client checkLoginMdp(String login, String mdp);
	public List<Reservation> checkReservation(int id);
	
	
	
	
	
}
