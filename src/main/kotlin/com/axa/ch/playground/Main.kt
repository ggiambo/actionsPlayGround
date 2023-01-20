package com.axa.ch.playground

fun main() {
    Main().start()
}

class Main {
    fun start() {
        (1..10).forEach {
            println("$it: Here we are again now place your bets")
        }
    }
}