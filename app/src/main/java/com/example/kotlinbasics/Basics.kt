package com.example.kotlinbasics

fun main(){

    var daisy = Dog("Daisy", "Dwarf") // creating an instance of the Dog class

    println(daisy.name + " is a " + daisy.breed + " and is " + daisy.age + " years old.")
//    println(daisy.name)
    daisy.age = 2
    println(daisy.name + " is a " + daisy.breed + " and is " + daisy.age + " years old.")

    var book = Book()
    println(book.author)
    println(book.title)
    println(book.yearPublished)


    var customBook = Book("The Alchemist", "Paulo Coelho", 1988)
    println(customBook.author)
    println(customBook.title)
    println(customBook.yearPublished)

}
