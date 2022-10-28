package Practice5;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    Rectangle(){

    }
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length + width);
    }
    @Override
    public String toString(){
        return "\nRectangle\n" +
                " color = " + getColor() + '\n' +
                " filled = " + isFilled() + '\n' +
                " width = " + getWidth() + '\n' +
                " length = " + getLength() + '\n' +
                " area = " + getArea() + '\n' +
                " perimeter = " + getPerimeter() + '\n';
    }
}
