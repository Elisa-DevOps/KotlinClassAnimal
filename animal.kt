//Project: Animal Classes
//Purpose:
//Author: Elisa Aldridge

open class Animal(val name: String) {
    open fun makeSound(): String {
        return "growl"
    }

    fun legCount(): Int {
        var x = 4
        return x
    }

}

class Cat: Animal {
    constructor(name: String): super(name) {
        println("inside secondary constructor")
    }
    
    override fun makeSound(): String {
        return "meow"
    }
}

fun main() {
    val dog = Animal("Spot")
    println(dog.name)       //property 'name' inside constructor that can be accessed
    println("${dog.name} has ${dog.legCount()} legs")
    
    val cat = Cat("Kitty")
    println(cat.makeSound())
}