package fr.eni.Cinema.bll;

import java.util.List;

import fr.eni.Cinema.bo.Seance;

public interface SeanceManager {
	
	public void create(Seance seance);
	public List<Seance> read();
	public void update(int id);
	public void delete(int id);
	
	public int checkPlaceDispo(Seance seance);

}
