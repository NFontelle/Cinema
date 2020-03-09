package fr.eni.Cinema.bll;

import java.util.List;

import fr.eni.Cinema.bo.Reservation;


public interface ReservationManager {

	public void create(Reservation resa);
	public List<Reservation> read();
	public void update(int id);
	public void delete(int id);
	
	public void annulerReservation(int id);
	
}
