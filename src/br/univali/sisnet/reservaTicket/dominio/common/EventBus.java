package br.univali.sisnet.reservaTicket.dominio.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {
	
	private Map<Class<? extends Event>, List<EventHandler<? extends Event>>> listeners = new HashMap<>();

    public <T extends Event> void register(Class<T> eventType, EventHandler<T> listener) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    @SuppressWarnings("unchecked")
	public <T extends Event> void publish(T event) {
        List<EventHandler<? extends Event>> eventHandlers = listeners.get(event.getClass());
        if (eventHandlers != null) {
            for (EventHandler<?> handler : eventHandlers) {
                ((EventHandler<T>) handler).handleEvent(event);
            }
        }
    }
    
}
