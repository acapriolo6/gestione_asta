package gestione_asta.dto;

public class UtenteDTO {
	
	
	
	public UtenteDTO(String username, String lastName, String firstName) {
		this.username = username;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	private String username;
	private String lastName;
	private String firstName;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "UtenteDTO [username=" + username + ", lastName=" + lastName + ", firstName=" + firstName + "]";
	}
	
	

}
