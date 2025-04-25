package com.example.kotlinbasics

import java.time.Year

class Book(
    val title : String = "unknown",
    val author : String = "Anonymous",
    val yearPublished : Int = Year.now().value
){
    fun print(){
        println("$title was written by $author in $yearPublished")
    }

}