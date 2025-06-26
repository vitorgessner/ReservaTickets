package br.univali.sisnet.reservaTicket.dominio.notification;

import br.univali.sisnet.reservaTicket.dominio.common.EventQueue;

public class NotificationService {
    public void sendNotification(String notificationId) {
        NotificationSentEvent event = new NotificationSentEvent(notificationId);
        EventQueue.publish(event);
    }
}
