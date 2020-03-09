package fr.eni.Cinema.bll;

import java.util.List;

import fr.eni.Cinema.bo.Salle;

public interface SalleManager {

	public void create(Salle salle);
	public List<Salle> read();
	public void update(int id);
	public void delete(int id);






}