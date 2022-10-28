package Practice;

    abstract class Bank{
        int deposit;
        Bank(int deposit){
            this.deposit = deposit;
        };
    }
    class BankA extends Bank{

        BankA(int deposit) {
            super(deposit);
        }
    }
    class BankB extends Bank{

        BankB(int deposit) {
            super(deposit);
        }
    }
    class BankC extends Bank{

        BankC(int deposit) {
            super(deposit);
        }
    }
    public class MyFirstProgram {
        public static void main(String[] args) {
            Bank b1 = new BankA(100);
            Bank b2 = new BankB(150);
            Bank b3 = new BankC(200);

            System.out.println("DEPOSIT ON BANK A : " + b1.deposit);
            System.out.println("DEPOSIT ON BANK B : " + b2.deposit);
            System.out.println("DEPOSIT ON BANK C : " + b3.deposit);
        }
    }