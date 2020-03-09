package fr.eni.Cinema.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.Cinema.bo.Film;
import fr.eni.Cinema.dao.FilmRepository;

@Service
public class FilmManagerImpl implements FilmManager {

	@Autowired
	FilmRepository dao;
	
	@Override
	public void create(Film film) {
		dao.save(film);
	}

	@Override
	public List<Film> read() {
		return (List<Film>) dao.findAll();
	}

	@Override
	public void update(int id) {
		Film film = dao.trouveParId(id);
		dao.save(film);
	}

	@Override
	public void delete(int id) {
		Film film = dao.trouveParId(id);
		dao.delete(film);
	}

}
