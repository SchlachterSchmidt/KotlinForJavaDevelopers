package learnkotlin._26javainteroperability.kotlinfromjava;

public class CallKotlinFromJava {

    public static void main(String[] args) {

        // this is familiar
        Car car = new Car("Datsun", "orange", 1977, true);

        // calling the top level function is not. For the top level function, a static class is created under the covers
        // with the file name plus extension. By default this would be CarKt, but we can change it with the JvmName
        // annotation (see Car.kt)
        KotlinCar.topLevel();

        // same goes for extension functions, but we have to pass an instance as arg. not very nice
        KotlinCar.print(car);

        // getters are generated under the covers for vals, setters for vars as well
        System.out.println(car.getColor());

        // for booleans, the getter is called is* rather than get*
        car.isAutomatic();
        // sets are the same
        car.setAutomatic(false);

        // with the annotation @JvmField we can access properties directly bypassing the generated constructor
        System.out.println(car.year);
    }
}
