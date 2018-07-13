package learnkotlin._21lists

fun main(args: Array<String>) {
    // kotlin mostly uses Java collections, and while it is possible to transform an immutable collection
    // that is creating a brand new instance each time

    // listOf is using the java.util.Array class, which is mutable (members can be changed, but not added /removed)
    // Kotlin makes it immutable by removing set methods from the interface. So while immutable in Kotlin,
    // it is very well mutable in Java interop:
    val strings = listOf("Spring", "Summer")
    println(strings.javaClass)

    // now we're getting a Kotlin collection.
    val emptyList = emptyList<String>()
    println(emptyList.javaClass)
    if (!emptyList.isEmpty()) println(emptyList[0])

    // null is removed from listOfNotNulls. ArrayList under the hood
    val notNullList = listOfNotNull("Hello", null, "not null ")
    println(notNullList)
    println(notNullList.javaClass)

    // we can ask for an ArrayList explicitly:
    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList.javaClass)

    // and we also get an A rrayList if we create a mutable list:
    val mutableList = mutableListOf<Int>(1, 2, 3)
    println(mutableList.javaClass)

    // two ways to change values in a mutable list (same for get
    mutableList[1] = 20
    mutableList.set(2, 30)
    println(mutableList)

    // regular array of Strings
    val colorArray = arrayOf("black", "blue", "green")
    println(colorArray.javaClass)
    // using the spread (*) operator to unpack the values in colorArray
    val colorList1 = listOf(*colorArray)
    val colorList2 = colorArray.toList()
    println(colorList1.javaClass)
    println(colorList2.javaClass)

    val ints = intArrayOf(1, 2, 3)
    println(ints.javaClass)
    println(ints.toList())
}