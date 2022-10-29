package Practice1;

public class Main {
    //main function
    public static void main(String[] args) {
        //creating a new object of Author class and storing in the reference variable a1
        Author a1 = new Author("George RR Martin", "rrgeomartin@gmail.com");
        //creating a new object of Book class and storing in the reference variable a1
        Book b1 = new Book("123","A Song of Ice and Fire", a1, 50, 2);
        //returning values of object
        System.out.println(b1);
    }
}