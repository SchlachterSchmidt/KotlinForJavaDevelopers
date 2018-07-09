package learnkotlin._07accessmodifiers

data class Car(val color: String,  val model: String, val year: Int) {
    // getting nice toString, equals and copy implementations for free with data classes
    // data classes cannot be sealed, abstract or inner classes
    // need one or more arg for primary constructor
}