package br.univali.sisnet.reservaTicket.dominio.common;

import br.univali.sisnet.reservaTicket.dominio.notification.NotificationSentEvent;
import br.univali.sisnet.reservaTicket.dominio.payment.PaymentProcessedEvent;
import br.univali.sisnet.reservaTicket.dominio.ticketing.TicketReservedEvent;
import br.univali.sisnet.reservaTicket.dominio.trip.TripScheduledEvent;

public class EventQueue {
    

    public EventQueue(){

    }

    public static void publish(TicketReservedEvent event){

    }

    public static void publish(TripScheduledEvent event){

    }

    public static void publish(NotificationSentEvent event){

    }

    public static void publish(PaymentProcessedEvent event){

    }
}
