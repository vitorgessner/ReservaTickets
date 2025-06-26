package br.univali.sisnet.reservaTicket.app;

import br.univali.sisnet.reservaTicket.dominio.common.EventBus;
import br.univali.sisnet.reservaTicket.dominio.notification.*;
import br.univali.sisnet.reservaTicket.dominio.payment.*;
import br.univali.sisnet.reservaTicket.dominio.ticketing.*;
import br.univali.sisnet.reservaTicket.dominio.trip.*;

public class App {

	public static void main(String[] args) {
		EventBus eventBus = new EventBus();
		
		eventBus.register(TripScheduledEvent.class, new TripScheduledEventHandler());
		eventBus.register(TicketReservedEvent.class, new TicketReservedEventHandler());
		eventBus.register(PaymentProcessedEvent.class, new PaymentProcessedEventHandler());
		eventBus.register(NotificationSentEvent.class, new NotificationSentEventHandler());

      
		TripScheduledEvent tripEvent = new TripScheduledEvent("TRIP-ID");
        eventBus.publish(tripEvent);

        TicketReservedEvent reservedEvent = new TicketReservedEvent("TICKET-ID");
        eventBus.publish(reservedEvent);

        PaymentProcessedEvent paymentEvent = new PaymentProcessedEvent("PAYMENT-ID");
        eventBus.publish(paymentEvent);

        NotificationSentEvent notificationEvent = new NotificationSentEvent("NOTIFICATION-ID");
        eventBus.publish(notificationEvent);
	}
}
