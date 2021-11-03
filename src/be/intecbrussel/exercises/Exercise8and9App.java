package be.intecbrussel.exercises;

import java.util.Arrays;

public class Exercise8and9App {
    public static void main(String[] args) {
        // Exercise 8
        Rectangle rectangle = new Rectangle(45,33,2,4);
        Rectangle rectangle2 = new Rectangle(45,33,2,4);
        Square square = new Square(55,23,2);
        Circle circle = new Circle(4,2,2);
        Triangle triangle = new Triangle(87,87,87);
        IsoScelesTriangle isoScelesTriangle = new IsoScelesTriangle(11,45,55);

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);
        System.out.println(triangle);
        System.out.println(isoScelesTriangle);

        System.out.println("Using equals method (That's good!)");
        System.out.println(rectangle.equals(rectangle2));
        System.out.println("Using == (That's bad!)");
        System.out.println(rectangle == rectangle2);

        // Exercise 9
        Shape[] shapes = {rectangle,rectangle2,square,circle,triangle,isoScelesTriangle,new Triangle(isoScelesTriangle), new Rectangle(square), new Circle(), new Rectangle()};

        for (Shape shape : shapes) {
            System.out.print(shape.getClass().getSimpleName() + ":\n\t");
            System.out.print("Perimeter: " + shape.getPerimeter());
            System.out.print(" | Area: " + shape.getArea());
            System.out.print(" | X: " + shape.getX());
            System.out.print(" | Y: " + shape.getY());
            printShapeDetail(shape);
            System.out.println();
        }

    }

    private static void printShapeDetail(Shape shape) {
        // Begin eerst met de subklassen voor je hun superklasse doet!
        if (shape instanceof Square){
            Square square = (Square) shape;
            System.out.print(" | Side: " + square.getSide());
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.print(" | Length: " + rectangle.getLength());
            System.out.print(" | Width: " + rectangle.getWidth());
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.print(" | Radius: " + circle.getRadius());
        } else if (shape instanceof IsoScelesTriangle) {
            IsoScelesTriangle isoScelesTriangle = (IsoScelesTriangle) shape;
            System.out.print(" | Width: " + isoScelesTriangle.getWidth());
            System.out.print(" | Height: " + isoScelesTriangle.getHeight());
            System.out.print(" | Perpendicular: " + isoScelesTriangle.getPerpendicular());
        } else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            System.out.print(" | Width: " + triangle.getWidth());
            System.out.print(" | Height: " + triangle.getHeight());
            System.out.print(" | Perpendicular: " + triangle.getPerpendicular());
        }
    }
}
