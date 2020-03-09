package fr.eni.Cinema.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.Cinema.bll.FilmManager;
import fr.eni.Cinema.bo.Film;

@RestController
public class FilmController {

	@Autowired
	FilmManager filmManager;
		
	@CrossOrigin
	@RequestMapping(path="/list_films", method = RequestMethod.GET)
	public List<Film> listeFilms(){
		List<Film> films = filmManager.read();
		return films;
	}

}
