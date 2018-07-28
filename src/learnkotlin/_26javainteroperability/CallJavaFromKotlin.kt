package learnkotlin._26javainteroperability

fun main(args: Array<String>) {
    // creating an instance of a java-class Car
    var car = Car("Green", "Ford", 1966)

    // we set properties just like we do in Kotlin
    car.model = "DeTomaso"
    println(car)

    // the default return type from a java getter that isn't annotated is the nullable type
    // assigning null here works without any special precautions
    var model = car.model
    model = null
    // javaClass can only be called on non-nullable types, so this is not available to us
    // model.javaClass

    // the @Nullable annotation informs the compiler that a null value may occur
    val color: String = car.color!!

    // or that null as value is fine. In this case, it is not required
    car.color = null

    // this will throw a IllegalArgumentException, as the @NotNull annotation is checked at runtime
    // car.year = null

    // or if we get the non-nullable property,
    val year = car.color
}