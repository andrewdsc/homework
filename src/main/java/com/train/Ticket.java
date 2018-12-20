package com.train;

public class Ticket {
    int tickets;
    int round_trip;
    int tickets_remainder;
    public Ticket(int tickets, int round_trip) {
        this.tickets = tickets;
        this.round_trip = round_trip;
    }

    public void calculator()
    {
        double tickets_money = 0;
        String error_message = "";

        if(tickets > 0) {

            tickets_remainder = tickets -  (round_trip * 2);
            tickets_money = (round_trip*2000) * 0.9;

            if(tickets_remainder>=0)
            {
                tickets_money += tickets_remainder*1000;
            }
            else
            {
                error_message = "你輸入的車票數量錯誤!!";
            }


        }
        else
        {
            error_message = "你輸入的車票數量錯誤!!";
        }

        if(error_message.equals("")) {
            System.out.println("Total tickets:" +  tickets);
            System.out.println("Round-trip:" +  round_trip);
            System.out.println("Total:" +  tickets_money);
        }
        else
        {
            System.out.println(error_message);
        }
    }
}
