package fr.eni.Cinema.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.Cinema.bo.Client;
import fr.eni.Cinema.bo.Reservation;
import fr.eni.Cinema.dao.ClientRepository;

@Service
public class ClientManagerImpl implements ClientManager {

	@Autowired
	ClientRepository dao;
	
	@Override
	public void create(Client client) {
		dao.save(client);
	}

	@Override
	public List<Client> read() {
		return (List<Client>) dao.findAll();
	}

	@Override
	public void update(int id) {
		Client client = dao.trouveParId(id);
		dao.save(client);
	}

	@Override
	public void delete(int id) {
		Client client = dao.trouveParId(id);
		dao.delete(client);
	}

	@Override
	public Client checkLoginMdp(String login, String mdp) {
		return dao.verifCnx(login, mdp);
	}

	@Override
	public List<Reservation> checkReservation(int id) {
		Client client = dao.trouveParId(id);
		return client.getReservations();
	}

	@Override
	public Client select(int id) {
		return dao.trouveParId(id);
	}

}
