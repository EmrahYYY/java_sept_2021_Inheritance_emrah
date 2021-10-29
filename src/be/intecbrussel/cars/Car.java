package be.intecbrussel.cars;

public class Car {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void accelerate() {
        System.out.println("Car goes brrrrrrr");
    }

    public void decelerate() {
        System.out.println("Car goes slow");
    }
}
