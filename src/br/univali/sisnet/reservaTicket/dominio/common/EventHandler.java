package br.univali.sisnet.reservaTicket.dominio.common;

public interface EventHandler<T> {
    void handleEvent(T event);
}
