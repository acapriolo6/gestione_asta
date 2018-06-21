package gestione_asta.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Customer {
	
	@Id
	private Long id;
	
	private String name;
	private String surname;
	private String email;
	private String username;
	private String password;
	
	@ManyToMany
	@JoinTable(name= "bids",
		joinColumns = {
			@JoinColumn(name="customer_id") },
		inverseJoinColumns = {
			@JoinColumn(name="auction_id")
		}
	)
	private List<Customer> offers;
	
	
	
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getEmail() {
		return email;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public Customer(Long id, String name, String surname, String email, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	public Customer() {}
	
	
}
