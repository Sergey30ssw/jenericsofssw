package ru.netology.javaqa;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        return Integer.compare(t1.getTimeTo() - t1.getTimeFrom(), t2.getTimeTo() - t2.getTimeFrom());
    }
}