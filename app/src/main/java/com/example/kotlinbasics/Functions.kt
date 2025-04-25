package com.example.kotlinbasics


data class CoffeeDetails(
    val sugarCount : Int,
    val name : String,
    val size: String,
    val creamAmount : Int
)

fun main(){
    askCoffeeDetails()
}

// Define the function
fun makeCoffee(coffeeDetails: CoffeeDetails){
    println("Starting to make coffee")
    if (coffeeDetails.sugarCount < 0) println("You can't have negative sugar")
    else if (coffeeDetails.sugarCount == 0) println("Coffee with no sugar for ${coffeeDetails.name}")
    else if (coffeeDetails.sugarCount == 1) println("Coffee with 1 spoon of sugar for ${coffeeDetails.name}")
    else println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")
}

fun askCoffeeDetails(){
    println("Who is the coffee for? ")
    val name = readLine()!!
    println("How many spoons of sugar? ")
    val sugarCount = readLine()!!.toInt()
    println("What is the size of the coffee? ")
    val size = readLine()!!
    println("How much cream do you want? ")
    val creamAmount = readLine()!!.toInt()
    val coffeeForDenis = CoffeeDetails(sugarCount, name, size, creamAmount)
    makeCoffee(coffeeForDenis)
}


fun add(num1 : Int, num2 : Int): Int {
    return  num1 + num2
}