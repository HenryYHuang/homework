package com.train

import java.util.*

fun main(args: Array<String>) {
    var exit = 0
    while (exit != -1) {
        print("Please enter number of tickets:\t")
        val ticket = readLine()!!.toInt()
        exit = ticket
        if (exit != -1) {
            print("How many round-trip tickets:\t")
            val roundTrip = readLine()!!.toInt()
            val tickets = TicketKotlin(ticket, roundTrip)
            tickets.print()
        }
    }

}


class TicketKotlin(val ticket: Int, val roundTrip: Int) {

    private var percent = 0.9f
    private var ticketPrice = 1000
    private var roundTripPrice = 2000f
    private var roundTripPriceDiscountAmount = 0
    private var ticketAmount = 0
    private var total = 0

    init {
        ticketAmount = (ticket - roundTrip) * ticketPrice
        roundTripPriceDiscountAmount = (roundTripPrice * percent).toInt() * roundTrip
        total = ticketAmount + roundTripPriceDiscountAmount
    }

    fun print() {
        println("Total tickets:\t$ticket")
        println("Round-trip:\t$roundTrip")
        println("Total:\t$total")
    }
}
