package br.com.bbnsdevelop.factory;

public final class AccountFactory {

    public static Account create(String type, Owner owner) {
        return switch (type) {
            case "P" -> new AccountForPeople(owner);
            case "C" -> new AccountForCompany(owner);
            default -> throw new IllegalArgumentException("not implemented");
        };
    }



}
