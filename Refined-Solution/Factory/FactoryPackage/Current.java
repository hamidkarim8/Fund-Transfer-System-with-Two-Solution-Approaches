package FactoryPackage;

public class Current extends Account {
    public Current(String accountNumber, double balance, User user) {
        super(accountNumber, balance, user);
    }

    public String getAccountType() {
        return "Current Account";
    }
}
