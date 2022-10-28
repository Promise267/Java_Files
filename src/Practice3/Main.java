package Practice3;

import java.util.Date;

public class Main{
    public static void main(String[] args) {
        Customer c1 = new Customer("Promise");
        c1.setMember(true);
        c1.setMemberType("Gold");
        System.out.println(c1);
        Date d1 = new Date(2022, 10,8 ,3 ,15,00);
        Visit v1  = new Visit(c1.getName(), d1);
//        v1.setServiceExpense(30 - (30 * DiscountRate.getServiceDiscountRate(c1.getMemberType())));
//        v1.setProductExpense(2000 - (2000 * DiscountRate.getProductDiscountRate(c1.getMemberType())));
        v1.setServiceExpense(30);
        v1.setServiceExpense(2000);
        System.out.println(v1);

//        Customer c2 = new Customer("Jamal");
//        c2.setMember(true);
//        c2.setMemberType("Premium");
//        System.out.println(c2);
//        Date d2 = new Date(2022, 10,10 ,9 ,40,32);
//        Visit v2  = new Visit(c2.getName(), d2);
//        v2.setServiceExpense(30 - (30 * DiscountRate.getServiceDiscountRate(c2.getMemberType())));
//        v2.setProductExpense(2000 - (2000 * DiscountRate.getProductDiscountRate(c2.getMemberType())));
//        System.out.println(v2);
    }
}