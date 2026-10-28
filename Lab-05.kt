//Task 1

//fun main() {
//    print("Enter a single character: ")
//    val input = readln()
//    val ch = input[0]
//
//    println("Character: '$ch'")
//    println("Is letter: ${ch.isLetter()}")
//    println("Is digit: ${ch.isDigit()}")
//    println("Is whitespace: ${ch.isWhitespace()}")
//    println("Uppercase: ${ch.uppercaseChar()}")
//    println("Lowercase: ${ch.lowercaseChar()}")
//}

//Task 2

//fun main() {
//    print("Enter a letter: ")
//    val ch = readln()[0].lowercaseChar()
//
//    if (ch.isLetter()) {
//        when (ch) {
//            'a', 'e', 'i', 'o', 'u' -> println("It is a Vowels")
//            else -> println("It is a Consonant")
//        }
//    } else {
//        println("It is not a letter")
//    }
//}

//Task 3

//fun main() {
//    print("Enter a text line: ")
//    val text = readln()
//
//    var letterCount = 0
//    var digitCount = 0
//    var spaceCount = 0
//
//    for (ch in text) {
//        if (ch.isLetter()) letterCount++
//        else if (ch.isDigit()) digitCount++
//        else if (ch.isWhitespace()) spaceCount++
//    }
//
//    println("Letters: $letterCount")
//    println("Digits: $digitCount")
//    println("Spaces: $spaceCount")
//}

//Challenge: Simple Caesar Cipher

//fun main() {
//    print("Enter a word to encrypt: ")
//    val word = readln()
//
//    var encrypted = ""
//
//    for (ch in word) {
//        val nextChar = ch + 1
//        encrypted += nextChar
//    }
//
//    println("Encrypted text: $encrypted")
//}