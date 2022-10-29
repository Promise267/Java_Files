package Practice3;
import java.util.Date;

//declaring Visit class which extends properties of Customer class
public class Visit extends Customer{

        ///declaring instances
        private Customer customer;
        private Date date;
        private static double serviceExpense;
        private static double productExpense;

        //parameterized constructor
        Visit(String name) {
                super(name);
        }

        //constructor overloading
        //parameterized constructor
        Visit(String name, Date date) {
                super(name);
                this.date = date;
        }
        //getters and setters
        public String getName(){return (customer.getName());}

        public double getServiceExpense() {return serviceExpense;}

        public void setServiceExpense(double ex, double discount) {serviceExpense = ex - (ex * discount); }

        public  double getProductExpense() {return productExpense;}

        public void setProductExpense(double ex, double discount) {
                productExpense = ex - (ex * discount);
        }
        public double getTotalExpense(){
                return (getProductExpense() + getServiceExpense());
        }

        //overriding toString method to display values of objects
        @Override
        public String toString() {
                return "\nVisit" + '\n' +
                        " customer = " + super.getName() + '\n' +
                        " Date = " + date + '\n' +
                        " serviceExpense = " + getServiceExpense()   + '\n' +
                        " productExpense = " + getProductExpense()  + '\n' +
                        " totalExpenses = " + getTotalExpense();
        }
}
