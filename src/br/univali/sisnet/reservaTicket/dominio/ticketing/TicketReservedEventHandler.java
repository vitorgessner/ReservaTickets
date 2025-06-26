package br.univali.sisnet.reservaTicket.dominio.ticketing;

import br.univali.sisnet.reservaTicket.dominio.common.EventHandler;

public class TicketReservedEventHandler implements EventHandler<TicketReservedEvent> {

    @Override
    public void handleEvent(TicketReservedEvent event) {
        // Lida com a lógica de TickerReservedEvent
    	System.out.println("Notifica o usuário que a reserva foi efetuada");
    }
}
