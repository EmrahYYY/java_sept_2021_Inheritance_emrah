package be.intecbrussel.geometry;

import be.intecbrussel.exercises.Rectangle;
import be.intecbrussel.exercises.Square;

public class GeometryApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,1);
        rectangle.setLength(10);
        rectangle.setWidth(15);

        System.out.println(rectangle.getLength() + " - " + rectangle.getWidth());

        Square square = new Square();
        square.setLength(10);
        square.setWidth(15);


        System.out.println(square.getLength() + " - " + square.getWidth());

    }
}
