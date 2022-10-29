package Practice2;
//declaring Mouse class which inherits from Animal class
public class Mouse extends Animal{
    //overriding function from parent class
    Mouse(String name) {
        super(name);
    }
    //overriding function from parent class
    @Override
    public void greets() {
        System.out.println("Squeal");
    }
}
