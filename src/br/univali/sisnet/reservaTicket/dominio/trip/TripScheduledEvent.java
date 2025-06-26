package br.univali.sisnet.reservaTicket.dominio.trip;

import br.univali.sisnet.reservaTicket.dominio.common.Event;

public class TripScheduledEvent implements Event {
    public final String tripId;

    public TripScheduledEvent(String tripId) {
        this.tripId = tripId;
    }
}
