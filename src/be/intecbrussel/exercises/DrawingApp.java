package be.intecbrussel.exercises;

import java.util.Random;
import java.util.Scanner;

public class DrawingApp {
    private final static Random rng = new Random();

    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        for (int i = 0; i < 150; i++) {
            drawing.add(generateRandomShape());
            System.out.println(drawing.getSize());
        }

        for (int i = 0; i < 150; i++) {
            drawing.remove(generateRandomShape());
            System.out.println(drawing.getSize());
        }
    }

    private static Shape generateRandomShape() {
        Shape shape;
        switch (new Random().nextInt(4)) {
            case 0:
                shape = new Rectangle(getRandomInt(), getRandomInt(), getRandomInt(), getRandomInt());
                break;
            case 1:
                shape = new Square(getRandomInt(), getRandomInt(), getRandomInt());
                break;
            case 2:
                shape = new Circle(getRandomInt(), getRandomInt(), getRandomInt());
                break;
            case 3:
                shape = new Triangle(getRandomInt(), getRandomInt(), getRandomInt());
                break;
            default:
                shape = new IsoScelesTriangle(getRandomInt(), getRandomInt(), getRandomInt());
                break;
        }
        return shape;
    }

    private static int getRandomInt() {
        return rng.nextInt(3);
    }
}
