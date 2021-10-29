package be.intecbrussel.exercises;

public class SquareApp {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();

        Square mySquare = new Square();
        System.out.println(mySquare.getArea());
        System.out.println(mySquare.getCircumference());
        System.out.println(mySquare.getLength());
        System.out.println(mySquare.getWidth());

        mySquare.setPosition(10,10);

        System.out.println(mySquare.getX());
        System.out.println(mySquare.getY());

        mySquare.setSide(-88);
        System.out.println(mySquare.getLength());
        System.out.println(mySquare.getWidth());

        Square square1 = new Square(12);
        Square square2 = new Square(12, 11, 10);
        Square square3 = new Square(square1);

        System.out.println(Rectangle.getCount());
        System.out.println(Square.getCount());
    }
}
