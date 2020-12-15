package com.example.javadesignpattern.singleton;

public class TicketMaker {
    private static TicketMaker ticketMaker;

    private int ticket = 1000;

    private TicketMaker() {

    }

    public static TicketMaker getInstance() {
        if (ticketMaker == null) {
            ticketMaker = new TicketMaker();
        }
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber() { // 다른 스레드에서 접근할지도 모르기 때문에 synchronized 사용
        return ticket++;
    }

}
