//Task 1

//fun main() {
//    print("Enter a number N: ")
//    val n = readln().toInt()
//
//    println("Numbers from 1 to $n:")
//    for (i in 1..n) {
//        print("$i ")
//    }
//    println()
//}

//Task 2

//fun main() {
//    print("Enter N: ")
//    val n = readln().toInt()
//
//    var sum = 0
//    var counter = 1
//
//    while (counter <= n) {
//        sum += counter
//        counter++
//    }
//
//    println("Sum of numbers from 1 to $n is: $sum")
//}

//Task 3

//fun main() {
//    val fruits = listOf("Apple", "Banana", "Cherry", "Mango")
//
//    println("Total fruits: ${fruits.size}")
//    println("Fruit list:")
//
//    for (fruit in fruits) {
//        println("- $fruit")
//    }
//}

//Task 4

//fun main() {
//    val hobbies = mutableListOf<String>()
//
//    println("Enter 3 of your hobbies:")
//    for (i in 1..3) {
//        print("Hobby $i: ")
//        val input = readln()
//        hobbies.add(input)
//    }
//
//    println("\nYour hobbies are:")
//    for (hobby in hobbies) {
//        println("* $hobby")
//    }
//}

//Challenge: Multiplication Table

//fun main() {
//    print("Enter a number for multiplication table: ")
//    val num = readln().toInt()
//
//    println("Multiplication table for $num:")
//    for (i in 1..10) {
//        println("$num x $i = ${num * i}")
//    }
//}