package br.univali.sisnet.reservaTicket.dominio.trip;

import br.univali.sisnet.reservaTicket.dominio.common.EventQueue;

public class TripService {
    public void scheduleTrip(String tripId) {
        TripScheduledEvent event = new TripScheduledEvent(tripId);
        EventQueue.publish(event);
    }
}
