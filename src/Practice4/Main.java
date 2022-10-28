package Practice4;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Promise", "Budanilkantha");
        Person p2 = new Person("Ram", "Kapan");
        Student s1 = new Student(p1.getName(), p1.getAddress(),"Computer Science", 4, 10000);
        Staff st1 = new Staff(p2.getName(), p2.getAddress(), "THe British College", 5000);
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(p2);
        System.out.println(st1);
    }
}
