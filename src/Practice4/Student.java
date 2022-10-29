package Practice4;
//declaring class Student which inherits properties from Person class
public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    //parameterized constructor
    Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    //getter and setter
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    ///toString method to display object values in format
    @Override
    public String toString() {
        return "\nStudent\n" +
                " program = " + program + '\n' +
                " year = " + year + '\n' +
                " fee = " + fee + '\n';
    }
}
