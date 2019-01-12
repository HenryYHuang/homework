package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int exit = 0;
        while (exit != -1){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter number of tickets:\t");
            int ticket = scanner.nextInt();
            exit = ticket;
            if (exit != -1) {
                System.out.print("How many round-trip tickets:\t");
                int roundTrip = scanner.nextInt();
                Tickets tickets = new Tickets(ticket, roundTrip);
                tickets.print();
            }
        }
    }
}
