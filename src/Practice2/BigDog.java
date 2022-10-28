package Practice2;

public class BigDog extends Dog {
    BigDog(String name){
        super(name);
    }

    @Override
    public void greets(){
        System.out.println("Wooow");
    }

    public void greets(Dog another){
        System.out.println("Wooooooow");
    }
    public void greets(BigDog another){
        System.out.println("Woooooooooooooooooow");
    }
}
