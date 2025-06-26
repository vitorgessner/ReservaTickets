package br.univali.sisnet.reservaTicket.dominio.notification;

import br.univali.sisnet.reservaTicket.dominio.common.EventHandler;

public class NotificationSentEventHandler implements EventHandler<NotificationSentEvent> {
    @Override
    public void handleEvent(NotificationSentEvent event) {
        // Lida com a lógica de NotificationSentEvent
    	System.out.println("Enviando notificação para usuário...");
    }
    
}
