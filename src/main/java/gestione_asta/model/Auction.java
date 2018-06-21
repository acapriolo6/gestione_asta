package gestione_asta.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Auction {

	@Id
	private int id;
	
	private Auction.STATE state;
	private Date startDate;
	private Date endDate;
	
	@ManyToOne
	private Customer supplier;
	
	/*@OneToOne
	private Object object;*/
	
	@ManyToMany
	@JoinTable(name= "bids",
		joinColumns = {
			@JoinColumn(name="auction_id") },
		inverseJoinColumns = {
			@JoinColumn(name="customer_id")
		}
	)
	private List<Customer> bidder;
	
	private enum STATE{
		PENDING,
		SUSPEND,
		STARTED,
		CLOSED
	}
	
}
