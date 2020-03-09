package fr.eni.Cinema.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.Cinema.bll.ReservationManager;
import fr.eni.Cinema.bo.Reservation;

@RestController
public class ReservationController {

	@Autowired
	ReservationManager resaManager;
	
	@RequestMapping(path="/liste_reservations", method=RequestMethod.GET)
	public List<Reservation> lst() {
		List<Reservation> listResa = resaManager.read();
		return listResa;
	}
	
	
}
