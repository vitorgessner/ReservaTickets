package br.univali.sisnet.reservaTicket.dominio.ticketing;

public class TicketReservedEvent {
    private String ticketId;

    public TicketReservedEvent(String ticketId){
        this.ticketId = ticketId;
    }
}
