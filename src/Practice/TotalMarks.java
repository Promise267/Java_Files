package Practice;

abstract class Marks{
    float percentage;
    float subject1;
    float subject2;
    float subject3;
    public Marks(float subject1, float subject2, float subject3){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    abstract float find_percentage();
}

class Student_A extends Marks{

    Student_A(float subject1, float subject2, float subject3){
        super(subject1, subject2, subject3);
    }
    @Override
    float find_percentage(){
        float total;
        total = subject1 + subject2 + subject3;
        percentage = (total/300)*100;
        return (float) percentage;
    }
}

class Student_B extends Marks{
    float subject4;

    Student_B(float subject1, float subject2, float subject3, float subject4){
        super(subject1, subject2, subject3);
        this.subject4 = subject4;
    }

    @Override
    float find_percentage() {
        float total;
        total = subject1 + subject2 + subject3 + subject4;
        percentage = (total/400)*100;
        return (float) percentage;
    }
}
public class TotalMarks {
    public static void main(String[] args) {

        Marks m1 = new Student_A(90,90,90);
        Marks m2 = new Student_B(60,70,80,90);

        System.out.println("PERCENTAGE OBTAINED BY STUDENT A = " + String.format("%.2f",m1.find_percentage()));
        System.out.println("PERCENTAGE OBTAINED BY STUDENT B = " + String.format("%.2f",m2.find_percentage()));
    }
}