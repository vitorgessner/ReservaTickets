package br.univali.sisnet.reservaTicket.dominio.trip;

import br.univali.sisnet.reservaTicket.dominio.common.EventHandler;

public class TripScheduledEventHandler implements EventHandler<TripScheduledEvent> {
    
	@Override
    public void handleEvent(TripScheduledEvent event) {
        // lida com a lógica de TripScheduledEvent
    	System.out.println("Notifica o usuário que a viagem já foi agendada");
    }
    
}
