package gestione_asta.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Utente {
	
	public Utente() {
		
	}

	public Utente(String username, String firstName, String lastName) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	
	@Id
	private String username;
	private String firstName;
	private String lastName;
	
	
	@Override
	public String toString() {
		return "Utente [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public String getUsername() {
		return username;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
	
}
