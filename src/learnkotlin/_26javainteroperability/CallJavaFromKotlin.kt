package learnkotlin._26javainteroperability

fun main(args: Array<String>) {
    // creating an instance of a java-class Car
    val car = Car("Green", "DeTommaso", 1966)

    // we set properties just like we do in Kotlin
    car.color = "blue"
    println(car)

    // this will throw a IllegalArgumentException, as the @NotNull annotation is checked at runtime
    // car.color = null

    // javaClass can only be called on non-nullable types
    var model: String = car.model
    println(model.javaClass)

    var year = car.year
    println(year.javaClass)

    var model: String = car.model

    var model: String = car.model

    println(model.javaClass)

    var year = car.year
    println(year.javaClass)

    var model: String = car.model
    println(model.javaClass)

    var year = car.year
    println(year.javaClass)
}