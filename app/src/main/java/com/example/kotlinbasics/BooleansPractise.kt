package com.example.kotlinbasics

fun main(){
    var isTrue : Boolean = true
    var isFalse = false

    println(isFalse)
    println(isTrue)

    println(isTrue && isFalse) // AND operation, both needs to be true
    println(isTrue || isFalse) // OR operation, only one needs to be true
    println(!isTrue) // NOT operation, opposite of the boolean value
}