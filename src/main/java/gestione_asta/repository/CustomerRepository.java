package gestione_asta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestione_asta.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	//List<Customer> findByLastName(L string);

}
