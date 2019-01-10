package com.train;

public class Tickets {
    int ticket;
    int roundTrip;

    public Tickets(int ticket, int roundTrip) {
        this.ticket = ticket;
        this.roundTrip = roundTrip;
    }

    public Tickets() {

    }

    public void print() {
        System.out.println("Total tickets:\t" + getTicket());
        System.out.println("Round-trip:\t" + getRoundTrip());
        //考慮是否直接*1800，但還是先練習轉型
        int roundTripAmount = (Float.valueOf(2000 * 0.9f)).intValue() * getRoundTrip();
        int ticket = (getTicket() - getRoundTrip()) * 1000;
        int total = roundTripAmount + ticket;
        System.out.println("Total:\t" + total);
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(int roundTrip) {
        this.roundTrip = roundTrip;
    }
}
