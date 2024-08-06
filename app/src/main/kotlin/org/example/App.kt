package org.example

class App {
    fun main() {
        val a = readln().toInt()
        val b = readln().toInt()
        val c = readln().toInt()
        val sum = readln().toInt()
//        var a = readln().split(" ").map { it.toInt() }
        var count = 0
        for (i in 0..a) {
            for (j in 0..b) {
                for (k in 0..c) {
                    if (i * 500 + j * 100 + k * 50 == sum) {
                        count++
                    }
                }
            }
        }

        println(count)
    }
}

