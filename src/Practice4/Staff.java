package Practice4;
//declaring class Staff which inherits properties from Person class
public class Staff extends Person{
    //declaring instances
    String school;
    double pay;

    //parameterized constructor
    Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    //getter and setter
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    //overriding toString method to display object in format
    @Override
    public String toString() {
        return "\nStaff\n" +
                " school = " + school + '\n' +
                " pay = " + pay + '\n';
    }
}
