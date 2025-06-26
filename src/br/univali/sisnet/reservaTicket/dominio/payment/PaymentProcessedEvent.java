package br.univali.sisnet.reservaTicket.dominio.payment;

public class PaymentProcessedEvent {
    private String paymentId;

    public PaymentProcessedEvent(String paymentId) {
        this.paymentId = paymentId;
    }
}
