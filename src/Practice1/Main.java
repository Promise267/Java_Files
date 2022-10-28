package Practice1;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("George RR Martin", "rrgeomartin@gmail.com");
        Book b1 = new Book("123","A Song of Ice and Fire", a1, 50, 2);
        System.out.println(b1);
    }
}