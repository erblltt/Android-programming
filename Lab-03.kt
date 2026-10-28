//Task 1

//fun main() {
//    print("Enter an integer: ")
//    val number = readln().toInt()
//
//    if (number % 2 == 0) {
//        println("The number $number is Even")
//    } else {
//        println("The number $number is Odd")
//    }
//}

//Task 2

//fun main() {
//    print("Enter a number: ")
//    val num = readln().toInt()
//
//    if (num > 0) {
//        println("Positive")
//    } else if (num < 0) {
//        println("Negative")
//    } else {
//        println("Zero")
//    }
//}

//Task 3

//fun main() {
//    print("Enter day number (1-7): ")
//    val day = readln().toInt()
//
//    val dayName = when (day) {
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        4 -> "Thursday"
//        5 -> "Friday"
//        6 -> "Saturday"
//        7 -> "Sunday"
//        else -> "Invalid day number"
//    }
//
//    println("Day: $dayName")
//}

//Task 4

//fun main() {
//    print("Enter your age: ")
//    val age = readln().toInt()
//
//    if (age in 0..12) {
//        println("Category: Child")
//    } else if (age in 13..17) {
//        println("Category: Teenager")
//    } else if (age >= 18 && age <= 64) {
//        println("Category: Adult")
//    } else if (age >= 65) {
//        println("Category: Senior")
//    } else {
//        println("Invalid age")
//    }
//}

//Challenge: Mini Calculator

//fun main() {
//    print("Enter first number: ")
//    val a = readln().toDouble()
//    print("Enter operation (+, -, *, /): ")
//    val op = readln()
//    print("Enter second number: ")
//    val b = readln().toDouble()
//
//    val result = when (op) {
//        "+" -> a + b
//        "-" -> a - b
//        "*" -> a * b
//        "/" -> if (b != 0.0) a / b else "Cannot divide by zero"
//        else -> "Unknown operation"
//    }
//
//    println("Result: $result")
//}