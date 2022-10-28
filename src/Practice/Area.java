package Practice;
import java.util.Scanner;

//declaring abstract class Shape
abstract class Shape {
    //abstract methods don't have body
    abstract float RectangleArea(float length, float breadth);
    abstract float SquareArea(float side);
    abstract float CircleArea(float radius);
}

//declaring a class that inherits properties of Shape class using extends keyword
public class Area extends Shape {

    float length;
    float breadth;
    float side;

    Area(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    //constructor overloading
    Area(float side){
        this.side =  side;
    }

    //method overriding
    @Override
    float RectangleArea(float length, float breadth) {
        return length*breadth;
    }

    @Override
    float SquareArea(float side){
        return (float) Math.pow(side,2);
    }

    @Override
    float CircleArea(float radius) {return (float) (Math.PI*Math.pow(radius,2));}


    //declaring a method
    public static String position(int i) {
        if (i == 1) {return "FIRST";}
        else if (i == 2) {return "SECOND";}
        else if (i == 3) {return "THIRD";}
        else if (i == 4) {return "FOURTH";}
        else {return "FIFTH";}
    }
    //declaring main
    public static void main(String[] args) {
        float length;
        float breadth;
        float side;
        float radius;
        //declaring scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------AREA OF RECTANGLE-----------------------");
        //looping array of objects
        for (int i = 1; i<=4; i++){
            //declaring array of objects of Area class
            Area[] rectangle = new Area[100];
            System.out.print("ENTER LENGTH OF "+ position(i)  +" RECTANGLE = ");
            length = sc.nextFloat();
            System.out.print("ENTER BREADTH OF "+ position(i)  +" RECTANGLE = ");
            breadth = sc.nextFloat();
            rectangle[i] = new Area(length,breadth);

            System.out.println("AREA OF "+ position(i)  +" RECTANGLE = " + String.format("%.2f",rectangle[i].RectangleArea(length,breadth)));
        }
        System.out.println(" ");
        System.out.println("-----------------------AREA OF SQUARE-----------------------");
        for (int i = 1; i<=4; i++){
            Area[] square = new Area[100];
            System.out.print("ENTER SIDE LENGTH OF " + position(i) + " SQUARE = ");
            side = sc.nextFloat();
            square[i] = new Area(side);
            System.out.println("AREA OF " + position(i) +" SQUARE = " + String.format("%.2f",square[i].SquareArea(side)));
        }

        System.out.println(" ");
        System.out.println("-----------------------AREA OF CIRCLE-----------------------");
        for (int i = 1; i<=5; i++){
            Area[] circle = new Area[100];
            System.out.print("ENTER SIDE LENGTH OF "+ position(i) +" CIRCLE = ");
            radius = sc.nextFloat();
            circle[i] = new Area(radius);

            System.out.println("AREA OF "+ position(i) +" CIRCLE = " + String.format("%.2f",circle[i].CircleArea(radius)));
        }
    }
}
