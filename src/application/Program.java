package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {

    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount();

        account.getBalance();
        account.getNumber();
        account.getHolder();

    }
}
