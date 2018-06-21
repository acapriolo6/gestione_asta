package gestione_asta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestione_asta.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String>{
	
	List<Utente> findByLastName(String string);

}
