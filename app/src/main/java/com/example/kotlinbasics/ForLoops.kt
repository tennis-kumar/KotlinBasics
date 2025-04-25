package com.example.kotlinbasics

fun main(){
    var fruitsList = mutableListOf("Apple","Banana","Mango", "Orange","Grapes")

    // iteration list using for loop
    for (item in fruitsList) {
        println(item)
        if (item == "Mango") {
            fruitsList.removeLast()
            break
        }
    }

    // getting the index using for loop
    println(fruitsList.size)
    for (index in 0 until fruitsList.size) {
     println(index)
    }

    for (index in 0 .. fruitsList.size) {
        println(index)
    }





    println(fruitsList)

}