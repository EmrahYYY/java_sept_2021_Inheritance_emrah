package be.intecbrussel.exercises;

public class EqualityRocks {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(10, 15);
        Rectangle r5 = r2;
        Square s1 = new Square(10);
        Square s2 = new Square(15);

        Rectangle r3 = new Rectangle(10, 10, 5, 5);
        Rectangle r4 = new Rectangle(10, 15, 6, 6);
        Square s3 = new Square(10, 5, 5);
        Square s4 = new Square(15, 5, 6);


        r2.equals(r5);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(s1));
        System.out.println(r2.equals(s1));
        System.out.println(r2.equals(s2));
        System.out.println(r3.equals(r4));
        System.out.println(r3.equals(s3));
        System.out.println(r4.equals(s3));
        System.out.println(r4.equals(s4));
    }
}
