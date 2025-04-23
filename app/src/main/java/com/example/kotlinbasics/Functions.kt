package com.example.kotlinbasics

fun main(){
    makeCoffee(1, "Alice") // call the function

    makeCoffee(2, "Bob")

    makeCoffee(3, "Roman")

    makeCoffee(-1, "Doom")
}

// Define the function
fun makeCoffee(sugarCount : Int, name : String){
    println("Starting to make coffee")
    if (sugarCount < 0) println("You can't have negative sugar")
    else if (sugarCount == 0) println("Coffee with no sugar for $name")
    else if (sugarCount == 1) println("Coffee with 1 spoon of sugar for $name")
    else println("Coffee with $sugarCount spoons of sugar for $name")
}