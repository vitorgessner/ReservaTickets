package br.univali.sisnet.reservaTicket.dominio.notification;

public class NotificationSentEvent {
    private String notificationId;

    public NotificationSentEvent(String notificationId) {
        this.notificationId = notificationId;
    }
}
