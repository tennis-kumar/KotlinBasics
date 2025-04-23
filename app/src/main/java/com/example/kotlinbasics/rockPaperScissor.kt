package com.example.kotlinbasics

fun main(){


    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice!")
    playerChoice = readln()

    var isValid = false

    while (!isValid) {
        if (playerChoice == "Rock" || playerChoice == "Paper" || playerChoice == "Scissors") {
            isValid = true
        } else {
            println("Invalid choice. Please enter Rock, Paper, or Scissors.")
            playerChoice = readln()
    }
    }

    var randomNumber = (1..3).random()

//    if (randomNumber == 1) computerChoice = "Rock"
//    else if (randomNumber == 2) computerChoice = "Paper"
//    else if (randomNumber == 3) computerChoice = "Scissors"

    when (randomNumber) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }

    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    println("Winner is $winner")

}