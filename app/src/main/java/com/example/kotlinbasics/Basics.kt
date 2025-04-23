package com.example.kotlinbasics

fun main(){
    var name = "Tennis"

    println(name)

    name = "Kotlin"
    println(name)

    var age = readln().toInt()

    if (age > 18){
        println("You are an adult")
    }else{
        println("You are not an adult")
    }

}
