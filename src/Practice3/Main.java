package Practice3;

import java.util.Date;

public class Main{
    //main function
    public static void main(String[] args) {
        //declaring instance of class
        Customer c1 = new Customer("Promise");
        c1.setMember(true);
        c1.setMemberType("Gold");
        System.out.println(c1);
        Date d1 = new Date(2022, 10,8 ,3 ,15,00);
        Visit v1  = new Visit(c1.getName(), d1);

        v1.setServiceExpense(30, DiscountRate.getServiceDiscountRate(c1.getMemberType()));
        v1.setProductExpense(2000, DiscountRate.getProductDiscountRate(c1.getMemberType()));
        System.out.println(v1);
    }
}