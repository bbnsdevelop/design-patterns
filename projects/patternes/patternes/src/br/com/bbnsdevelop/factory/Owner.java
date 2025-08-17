package br.com.bbnsdevelop.factory;

public class Owner {

    private String name;
    private String docNumber;

    public Owner(String name, String docNumber){
        this.name = name;
        this.docNumber = docNumber;
    }

    public String getName(){
        return this.name;
    }
}
