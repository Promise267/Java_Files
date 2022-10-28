package Practice5;

public class Square extends Rectangle{
    Square(){

    }

    Square(double side){
        super(side,side);
    }

    Square(double side, String color, boolean filled){
        this.setColor(color);
        this.setFilled(filled);
        this.setLength(side);
        this.setWidth(side);
    }

    public double getSide(){
        return this.getLength();
    }

    public void setSide(double side){
        this.setLength(side);
    }

    public void setWidth(double side){
        side = this.getWidth();
    }

    public void setLength(double side){
        side = this.getLength();

    }



    public String toString(){
        return "\nSquare\n" +
                " color = " + getColor() + '\n' +
                " filled = " + isFilled() + '\n' +
                " width = " + getSide() + '\n' +
                " length = " + getSide() + '\n' +
                " area = " + getArea() + '\n' +
                " perimeter = " + getPerimeter();
    }
}
