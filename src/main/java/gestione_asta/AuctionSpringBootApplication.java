package gestione_asta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;

import gestione_asta.model.Customer;
import gestione_asta.repository.CustomerRepository;


@SpringBootApplication
public class AuctionSpringBootApplication {
	
	private static final Logger log = LoggerFactory.getLogger(AuctionSpringBootApplication.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AuctionSpringBootApplication.class, args);
	}
	
	@Bean(name="repositoryCommandLine")
	public CommandLineRunner commandLineRunner(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Customer(1L, "p", "p", "p", "p", "p"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			repository.findById(1L)
				.ifPresent(customer -> {
					log.info("Utente found with findById(\"jack\"):");
					log.info("--------------------------------");
					log.info(customer.toString());
					log.info("");
				});

			// fetch customers by last name
			log.info("Utente found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			/*repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});*/
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}

}