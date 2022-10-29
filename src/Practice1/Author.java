//declaring package
package Practice1;

//declaring author class
public class Author {
    //declaring instance variables
    private String name;
    private String email;

    //parameterized constructor
    Author(String name,String email){
        this.name = name;
        this.email = email;
    }

    //empty constructor
    public Author() {

    }

    //getter and setter function
    public String getName() {return name;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //toString function so object displays in this layout

    public String toString() {
        return " Author{" +
                " name = " + name + ", " + " email = " + email + " }";
    }
}
