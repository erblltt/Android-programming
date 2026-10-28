//Task 1

//class Person(val name: String, var age: Int) {
//    fun introduce() {
//        println("Hi, I'm $name and I am $age years old.")
//    }
//}
//
//fun main() {
//    val person1 = Person("Erbolot", 17)
//    person1.introduce()
//
//    person1.age = 18
//    println("After birthday:")
//    person1.introduce()
//}

//Task 2

//class BankAccount(val owner: String, var balance: Double) {
//
//    fun deposit(amount: Double) {
//        if (amount > 0) {
//            balance += amount
//            println("Deposited $$amount. New balance: $$balance")
//        }
//    }
//
//    fun withdraw(amount: Double) {
//        if (amount <= balance) {
//            balance -= amount
//            println("Withdrew $$amount. New balance: $$balance")
//        } else {
//            println("Insufficient funds!")
//        }
//    }
//}
//
//fun main() {
//    val account = BankAccount("Erbolot", 100.0)
//    account.deposit(50.0)
//    account.withdraw(30.0)
//    account.withdraw(200.0)
//}

//Task 3

//open class Animal(val name: String) {
//    open fun makeSound() {
//        println("$name makes a sound.")
//    }
//}
//
//class Dog(name: String) : Animal(name) {
//    override fun makeSound() {
//        println("$name barks: Woof! Woof!")
//    }
//}
//
//class Cat(name: String) : Animal(name) {
//    override fun makeSound() {
//        println("$name meows: Meow!")
//    }
//}
//
//fun main() {
//    val dog = Dog("Rex")
//    val cat = Cat("Whiskers")
//
//    dog.makeSound()
//    cat.makeSound()
//}

//Challenge: Vehicle Hierarchy

//open class Vehicle(val brand: String, val speed: Int) {
//    open fun showDetails() {
//        println("Brand: $brand, Speed: $speed km/h")
//    }
//}
//
//class ElectricCar(brand: String, speed: Int, val batteryCapacity: Int) : Vehicle(brand, speed) {
//    override fun showDetails() {
//        super.showDetails()
//        println("Battery Capacity: $batteryCapacity kWh")
//    }
//}
//
//fun main() {
//    val myTesla = ElectricCar("Tesla", 250, 100)
//    myTesla.showDetails()
//}