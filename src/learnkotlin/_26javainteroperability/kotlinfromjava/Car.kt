@file:JvmName("KotlinCar")

package learnkotlin._26javainteroperability.kotlinfromjava

fun topLevel() = println("I'm a top level function")

class Car(val name: String, val color: String, @JvmField val year: Int, var isAutomatic: Boolean)

fun Car.print() = println("print the car")