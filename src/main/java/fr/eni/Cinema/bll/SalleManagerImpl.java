package fr.eni.Cinema.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.Cinema.bo.Salle;
import fr.eni.Cinema.dao.SalleRepository;

@Service
public class SalleManagerImpl implements SalleManager {

	@Autowired
	SalleRepository dao;
	
	
	@Override
	public void create(Salle salle) {
		dao.save(salle);
	}

	@Override
	public List<Salle> read() {
		return (List<Salle>) dao.findAll();
	}

	@Override
	public void update(int id) {
		Salle salle = dao.trouveParId(id);
		dao.save(salle);
	}

	@Override
	public void delete(int id) {
		Salle salle = dao.trouveParId(id);
		dao.delete(salle);
	}

}
