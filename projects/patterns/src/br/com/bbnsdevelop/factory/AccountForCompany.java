package br.com.bbnsdevelop.factory;

import java.util.concurrent.ExecutionException;

public class AccountForCompany implements Account{


    private Owner owner;
    private double balance;

    public AccountForCompany(Owner owner){
        this.owner = owner;
    }


    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void withdraw(double value) {
        if (balance <= 0) {
            throw new IllegalArgumentException("balance is zero or negative");
        }
        this.balance = this.balance - value;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getOwner(){
        return this.owner.getName();
    }
}
