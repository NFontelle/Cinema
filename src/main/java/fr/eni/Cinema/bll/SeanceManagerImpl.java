package fr.eni.Cinema.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.Cinema.bo.Reservation;
import fr.eni.Cinema.bo.Salle;
import fr.eni.Cinema.bo.Seance;
import fr.eni.Cinema.dao.SeanceRepository;

@Service
public class SeanceManagerImpl implements SeanceManager {

	@Autowired
	SeanceRepository dao;
	
	@Override
	public void create(Seance seance) {
		dao.save(seance);
	}

	@Override
	public List<Seance> read() {
		return (List<Seance>) dao.findAll();
	}

	@Override
	public void update(int id) {
		Seance seance = dao.trouveParId(id);
		dao.save(seance);
	}

	@Override
	public void delete(int id) {
		Seance seance = dao.trouveParId(id);
		dao.delete(seance);
	}

	@Override
	public int checkPlaceDispo(Seance seance) {
		Salle salle = seance.getSalle();
		List<Reservation> resas = seance.getReservations();
		return salle.getNbPlace() - resas.size();
	}

}
