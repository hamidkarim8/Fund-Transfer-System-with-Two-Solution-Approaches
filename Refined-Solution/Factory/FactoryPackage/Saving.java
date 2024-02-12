package FactoryPackage;

public class Saving extends Account {
    public Saving(String accountNumber, double balance, User user) {
        super(accountNumber, balance, user);
    }

    public String getAccountType() {
        return "Saving Account";
    }
}