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

    val cat2 : Animal = Cat("Kitty2")
    //println(cat2.playYarn())    //Error intended to show cat2 cannot play yarn, class variable type is restricted to only what class Animal can access
}