package fr.eni.Cinema.bll;

import java.util.List;

import fr.eni.Cinema.bo.Film;


public interface FilmManager {

	public void create(Film film);
	public List<Film> read();
	public void update(int id);
	public void delete(int id);
	
	
}
