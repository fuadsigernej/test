package com.company;

//opg 1)

public class Customer {

    public String name;
    public int id;
    public double balance;

    public Customer (String names, int ids) {
        name = names ;
        id = ids ;
        balance = 0;

    }

    public Customer (String names, int ids, double balances) {
        name = names ;
        id = ids ;
        balance = balances;

    }



    public void deposit(double amount) {
        balance += amount;

    }
    public void withdraw (double amount) {
        if(balance>amount) {
            balance -= amount;
        } else {
            System.out.println("There isn't enough money in account");
        }

    }

    public double getBalance () {
        return balance;
    }


}
