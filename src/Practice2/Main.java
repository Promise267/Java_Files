package Practice2;

public class Main {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat("Tom");
        cat1.greets();
        Dog dog1 = new Dog("Tyke");
        dog1.greets();
        BigDog bigDog1 = new BigDog("Spike");
        bigDog1.greets();




        // Using Polymorphism
        Animal animal1 = new Cat("Tom");
        animal1.greets();
        Animal animal2 = new Dog("Tyke");
        animal2.greets();
        Animal animal3 = new BigDog("Spike");
        animal3.greets();

    }

}
