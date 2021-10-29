package be.intecbrussel.geometry;

import be.intecbrussel.exercises.Rectangle;
import be.intecbrussel.exercises.Square;

public class Polymorphism{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,1);
        Rectangle rectangularSquare = new Square();

        rectangularSquare.setWidth(30);
        System.out.println(rectangularSquare.getLength() + " - " + rectangularSquare.getWidth());
    }
}
