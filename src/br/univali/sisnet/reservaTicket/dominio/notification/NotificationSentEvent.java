package br.univali.sisnet.reservaTicket.dominio.notification;

import br.univali.sisnet.reservaTicket.dominio.common.Event;

public class NotificationSentEvent implements Event {
	public final String notificationId;

    public NotificationSentEvent(String notificationId) {
        this.notificationId = notificationId;
    }
}
