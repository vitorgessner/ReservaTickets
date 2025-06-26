package br.univali.sisnet.reservaTicket.dominio.payment;

import br.univali.sisnet.reservaTicket.dominio.common.EventHandler;

public class PaymentProcessedEventHandler implements EventHandler<PaymentProcessedEvent> {
    @Override
    public void handleEvent(PaymentProcessedEvent event) {
        // Lida com a lógica de PaymentProcessedEvent
    }
    
}
