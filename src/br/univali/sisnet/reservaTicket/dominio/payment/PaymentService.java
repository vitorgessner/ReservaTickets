package br.univali.sisnet.reservaTicket.dominio.payment;

import br.univali.sisnet.reservaTicket.dominio.common.EventQueue;

public class PaymentService {
    public void processPayment(String paymentId) {
        PaymentProcessedEvent event = new PaymentProcessedEvent(paymentId);
        EventQueue.publish(event);
    }
}
