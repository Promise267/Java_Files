package Practice3;
import java.util.Date;


public class Visit extends Customer{

        private Customer customer;
        private Date date;
        private static double serviceExpense;
        private static double productExpense;

        Visit(String name) {
                super(name);
        }

        Visit(String name, Date date) {
                super(name);
                this.date = date;
        }

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
