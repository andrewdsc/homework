package com.train

import java.util.*

fun main(args: Array<String>) {
    var check_point = true
    var scanner = Scanner(System.`in`)

    while (check_point) {
        print("Please enter number of tickets: ")
        var tickets = scanner.nextInt()
        if (tickets == -1) {
            check_point = false
            println("退出購票系統!!!")
        }
        else
        {
            print("How many round-trip tickets:  ")
            var round_trip = scanner.nextInt()
            var ticket = TicketKotlin(tickets, round_trip)
            ticket.calculator()
        }
    }
}

class TicketKotlin(var tickets:Int, var round_trip:Int){
    var tickets_money = 0.0
    var error_message = ""
    var tickets_remainder = 0

    fun calculator()
    {
        if (tickets > 0) {

            tickets_remainder = tickets - round_trip * 2
            tickets_money = round_trip * 2000 * 0.9

            if (tickets_remainder >= 0) {
                tickets_money += (tickets_remainder * 1000).toDouble()
            } else {
                error_message = "你輸入的車票數量錯誤!!"
            }


        } else {
            error_message = "你輸入的車票數量錯誤!!"
        }

        if (error_message == "") {
            println("Total tickets:$tickets")
            println("Round-trip:$round_trip")
            println("Total:$tickets_money")
        } else {
            println(error_message)
        }
    }
}