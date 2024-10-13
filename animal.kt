//Project: Animal Classes
//Purpose: Learning & Coding with the 4 Pillars of OOP
//Author: Elisa Aldridge

interface IAnimal{                          // Abstraction - defined relationship/ no implementation
    fun makeSound(): String
    fun legCount(): Int
}

open class Animal(val name: String) : IAnimal {       //val is encapsulated, val is immutable - open allows class Cat to extend class Animal
    override fun makeSound(): String {
        return "growl"
    }

    override fun legCount(): Int {
        var x = 4                           //var is not encapsulated, var is mutable
        return x
    }

}

class Cat: Animal {     //Inheritance
    constructor(name: String): super(name) {
        println("inside secondary constructor of class cat") //auto generates on initialization
    }
    
    override fun makeSound(): String {
        return "meow"
    }

    fun playYarn(): String {           
        return "played with yarn"
    }
}

fun main() {
    val dog : Animal = Animal("Spot")
    println(dog.name)       //property 'name' inside constructor that can be accessed
    println("${dog.name} has ${dog.legCount()} legs")
    
    val cat = Cat("Kitty")
    println(cat.makeSound())
    println("${cat.name} has ${cat.legCount()} legs")
    println(cat.playYarn())

    val cat2 : Animal = Cat("Kitty2")       //polymorphism 
    println(cat2.makeSound())
    println("${cat2.name} has ${cat2.legCount()} legs")
    //println(cat2.playYarn())    //Error intended to show cat2 cannot play yarn, class variable type is restricted to only what class Animal can access
}