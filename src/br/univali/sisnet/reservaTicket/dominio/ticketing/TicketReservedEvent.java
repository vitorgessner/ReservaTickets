package br.univali.sisnet.reservaTicket.dominio.ticketing;

import br.univali.sisnet.reservaTicket.dominio.common.Event;

public class TicketReservedEvent implements Event {
	public final String ticketId;

    public TicketReservedEvent(String ticketId){
        this.ticketId = ticketId;
    }
}
