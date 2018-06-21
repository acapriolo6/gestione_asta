package gestione_asta.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestione_asta.dto.UtenteDTO;
import gestione_asta.model.Customer;
import gestione_asta.repository.CustomerRepository;
import gestione_asta.Service.GestioneUtenteBE;

@Service
public class GestioneUtenteBEService implements GestioneUtenteBE{

	@Autowired
	CustomerRepository utenteRepository;
	
	public UtenteDTO load(String username) {
		// TODO Auto-generated method stub
		
		//Utente utente = utenteRepository.findById(username).orElse(new Utente(username, null, null));
		
		//return new UtenteDTO(utente.getUsername(), utente.getFirstName(), utente.getLastName());
		return new UtenteDTO();
	}
}
