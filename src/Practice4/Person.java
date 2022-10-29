package Practice4;

//declaring class person
public class Person {

    //declaring instances of class
    private String name;
    private String address;

    //parameterized constructor
    Person(String name, String address){
        this.name  = name;
        this.address = address;
    }


    //getter and setter
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //toString method to display object in format
    public String toString(){
        return "\nPerson\n Name = " + name + '\n' +
                " Address = " + address + '\n';
    }
}
