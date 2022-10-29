package Practice5;

public class Main {
    public static void main(String[] args) {
        //main function
        Shape s1 = new Shape("red", true);
        System.out.println(s1);
        Circle c1 = new Circle(5);
        System.out.println(c1);
        Rectangle r1 = new Rectangle(10,20,"blue", false);
        System.out.println(r1);
        Square sq1 = new Square(10,"green",true);
        System.out.println(sq1);
    }
}
