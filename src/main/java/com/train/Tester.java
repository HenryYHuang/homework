package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets:\t");
        Scanner scanner = new Scanner(System.in);
        int ticket = scanner.nextInt();
        System.out.print("How many round-trip tickets:\t");
        int roundTrip = scanner.nextInt();
        Tickets tickets = new Tickets(ticket, roundTrip);
        tickets.print();
    }
}