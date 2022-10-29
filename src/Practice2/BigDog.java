package Practice2;
//inheriting instances of Dog class
public class BigDog extends Dog {
    //constructor calling
    BigDog(String name){
        //calling constructor of its parent class to access properties
        super(name);
    }

    //method overloading
    //overriding abstract method of parent class
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
