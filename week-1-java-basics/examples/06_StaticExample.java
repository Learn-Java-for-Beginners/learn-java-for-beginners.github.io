package com.learnjava.week1.examples;

class BankAccount {

    private static int totalAccounts = 0;

    public BankAccount() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

public class StaticExample {

    public static void main(String[] args) {

        new BankAccount();
        new BankAccount();
        new BankAccount();

        System.out.println("Total Accounts: " +
                BankAccount.getTotalAccounts());
    }
}
