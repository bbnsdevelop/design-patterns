package br.com.bbnsdevelop.factory;

public class AccountForPeople implements Account{

    private Owner owner;
    private double balance;

    public AccountForPeople(Owner owner){
        this.owner = owner;
    }


    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void withdraw(double value) {
        this.balance = this.balance - value;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getOwner(){
        return this.owner.getName();
    }
}
