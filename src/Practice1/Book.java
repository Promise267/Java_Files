package Practice1;

//Book class inherits from Author class
public class Book extends Author {

    //declaring instance variables
    private String isbn;
    private String name;
    private double price;
    private int qty;
    private Author author;

    //parameterized constructor
    Book(String isbn, String name, Author author,double price){
        super();
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    //constructor overloading
    //parameterized constructor
    Book(String isbn, String name, Author author,double price, int qty){
        super();
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    //getter and setter function
    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public Author getAuthor() {
        return author;
    }

    //overriding toString function of Author class to display object in this format
    @Override
    public String toString() {
        return
                " isbn = " + getIsbn() + '\n' +
                " name = " + getName() + '\n' +
                 getAuthor() + '\n' +
                " price = " + getPrice() + '\n' +
                " qty = " + getQty();
    }
}