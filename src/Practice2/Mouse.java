package Practice2;

public class Mouse extends Animal{
    Mouse(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Squeal");
    }
}
