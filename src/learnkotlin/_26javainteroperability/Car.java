package learnkotlin._26javainteroperability;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class Car {

    private String color;
    private String model;
    private int year;

    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public @Nullable String getColor() { return color; }

    public void setColor(@Nullable String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public @NotNull int getYear() {
        return year;
    }

    public void setYear(@NotNull int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
