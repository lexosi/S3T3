package s3t3.GardenShop.application.port.out;

import java.util.List;

import s3t3.GardenShop.domain.Ticket;

public interface TicketRepository {

	void save(Ticket ticket);
	Ticket findTicket(List<Ticket> registeredSales, int tckID);
	void delete(Ticket ticket);
	    
}
