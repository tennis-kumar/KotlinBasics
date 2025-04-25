package com.example.kotlinbasics

fun main(){
    var fruitsList = mutableListOf("Apple","Banana")
    println(fruitsList)
    fruitsList.add("Orange")
    println(fruitsList)
    fruitsList.remove("Banana")
    println(fruitsList)
    println(fruitsList.contains("Banana"))
}