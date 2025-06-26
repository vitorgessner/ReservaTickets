package br.univali.sisnet.reservaTicket.dominio.notification;

import br.univali.sisnet.reservaTicket.dominio.common.EventHandler;
import br.univali.sisnet.reservaTicket.dominio.trip.TripScheduledEvent;

public class NotificationSentEventHandler implements EventHandler<NotificationSentEvent> {
    @Override
    public void handleEvent(NotificationSentEvent event) {
        // Lida com a lógica de NotificationSentEvent
    }
    
}
