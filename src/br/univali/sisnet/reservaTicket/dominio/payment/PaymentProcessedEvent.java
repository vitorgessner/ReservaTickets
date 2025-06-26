package br.univali.sisnet.reservaTicket.dominio.payment;

import br.univali.sisnet.reservaTicket.dominio.common.Event;

public class PaymentProcessedEvent implements Event {
	public final String paymentId;

    public PaymentProcessedEvent(String paymentId) {
        this.paymentId = paymentId;
    }
}
