package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        /*
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        // UP CASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWN CASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
        */

        // TEST @OVERRIDE

        Account acc1 = new Account(1001, "Alex", 1000.00);
        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);
        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());

        // POLIMORFISMO

        Account x = new Account(1020, "Alex", 1000.00);
        Account y = new BusinessAccount(1023, "Maria", 1000.00, 0.01);

        x.withdraw(50.00);
        y.withdraw(50.00);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
