package com.train

import java.util.*

fun main(args: Array<String>) {
    print("Please enter number of tickets:\t")
    val scanner = Scanner(System.`in`)
    val ticket = scanner.nextInt()
    print("How many round-trip tickets:\t")
    val roundTrip = scanner.nextInt()
    val tickets = TicketKotlin(ticket, roundTrip)
    tickets.print()
}


class TicketKotlin(val ticket: Int, val roundTrip: Int) {

    var percent = 0.9f
    var ticketPrice = 1000
    var roundTripPrice = 2000f
    var roundTripPriceDiscountAmount = 0
    var ticketAmount = 0
    var total = 0

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
