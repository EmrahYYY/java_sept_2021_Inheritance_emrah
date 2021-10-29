package be.intecbrussel.exercises;

public class Rectangle {
    private double length; // default = 0
    private double width; // default = 0
    private int x;
    private int y;

    private static int count;
    public static final int ANGLES = 4;

    public Rectangle(){
        this(0, 0);
    }

    public Rectangle(double length, double width) {
        this(length, width, 0, 0);
    }

    public Rectangle(double length, double width, int x, int y) {
        setLength(length);
        setWidth(width);
        setX(x);
        setY(y);
        count++;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getLength(), rectangle.getWidth(), rectangle.getX(), rectangle.getY());
    }

    public void setLength(double length) {
        boolean length2IsNegative = length < 0;

        if (length2IsNegative) {
            this.length = -length;
        } else {
            this.length = length;
        }
    }

    public void setWidth(double width2) {
        if (width2 < 0) {
            width = -width2;
        } else {
            width = width2;
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getCircumference() {
        double circumference = (length * 2) + (width * 2);
        return circumference;
    }

    public void setPosition(int x, int y) {
        setX(x);
        setY(y);
    }

    public void grow(int d) {
        setLength(length * d);
        setWidth(width * d);
    }

    public static int getCount() {
        return count;
    }
}