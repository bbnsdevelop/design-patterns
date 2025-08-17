package br.com.bbnsdevelop.factory;

public class Bank {
    public static void main(String[] args) {

        Account account1 = AccountFactory.create("P", new Owner("Jhon", "DOC1"));

        account1.withdraw(12.00);

        AccountForPeople p = (AccountForPeople) account1;
        System.out.println(p.getBalance());
        System.out.println(p.getOwner());
        p.deposit(15);
        System.out.println(p.getBalance());


        Account account2 = AccountFactory.create("C", new Owner("Ana", "DOC2"));
        try{
            account2.withdraw(12.00);
        }
        catch (Exception e) {
            if (e.getMessage().contains("balance is zero or negative")) {
                System.out.println(e.getMessage());
                account2.deposit(15);
            }
        }
        account2.withdraw(12);

        AccountForCompany c = (AccountForCompany) account2;
        System.out.println(c.getBalance());
        System.out.println(c.getOwner());
    }
}
