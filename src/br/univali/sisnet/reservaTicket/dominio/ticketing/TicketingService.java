package br.univali.sisnet.reservaTicket.dominio.ticketing;

import br.univali.sisnet.reservaTicket.dominio.common.EventQueue;

public class TicketingService {
    public void reserveTicket(String ticketId) {
        TicketReservedEvent event = new TicketReservedEvent(ticketId);
        EventQueue.publish(event);
    }
}
