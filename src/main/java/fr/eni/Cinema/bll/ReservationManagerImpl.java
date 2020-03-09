package fr.eni.Cinema.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.Cinema.bo.Reservation;
import fr.eni.Cinema.dao.ReservationRepository;

@Service
public class ReservationManagerImpl implements ReservationManager {

	@Autowired
	ReservationRepository dao;
	
	@Override
	public void create(Reservation resa) {
		dao.save(resa);
	}

	@Override
	public List<Reservation> read() {
		return (List<Reservation>) dao.findAll();
	}

	@Override
	public void update(int id) {
		Reservation resa = dao.trouveParId(id);
		dao.save(resa);
	}

	@Override
	public void delete(int id) {
		Reservation resa = dao.trouveParId(id);
		dao.delete(resa);
	}

	@Override
	public void annulerReservation(int id) {
		Reservation resa = dao.trouveParId(id);
		dao.delete(resa);
	}

}
