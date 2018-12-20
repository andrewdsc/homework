package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter number of tickets: ");
        int tickets = scanner.nextInt();
        System.out.printf("How many round-trip tickets:  ");
        int round_trip = scanner.nextInt();
        Ticket ticket = new Ticket(tickets, round_trip);
        ticket.calculator();
    }
}
