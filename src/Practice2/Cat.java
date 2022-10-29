package Practice2;
//declaring Cat class which inherits from Animal class
public class Cat extends Animal{
    //overriding function from parent class
    Cat(String name) {
        super(name);
    }
    //overriding function from parent class
    @Override
    public void greets() {
        System.out.println("MEOW");
    }
}
