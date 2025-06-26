package br.univali.sisnet.reservaTicket.dominio.common;

public interface EventHandler<T extends Event> {
    void handleEvent(T event);
}
