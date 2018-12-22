package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        boolean check_point = true;
        Scanner scanner = new Scanner(System.in);
        while (check_point) {
            System.out.printf("Please enter number of tickets: ");
            int tickets = scanner.nextInt();
            if (tickets == -1)
            {
                check_point = false;
                System.out.println("退出購票系統!!");
            }
            else {
                System.out.printf("How many round-trip tickets:  ");
                int round_trip = scanner.nextInt();
                Ticket ticket = new Ticket(tickets, round_trip);
                ticket.calculator();
                ticket = null; //將物件釋放掉
            }
        }
    }
}
