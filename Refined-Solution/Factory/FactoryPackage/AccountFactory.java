package FactoryPackage;

public class AccountFactory {
    public Account createAccount(String accountType, String accountNumber, double balance, User user) {
        switch (accountType.toLowerCase()) {
            case "saving":
                return new Saving(accountNumber, balance, user);
            case "current":
                return new Current(accountNumber, balance, user);
            default:
                throw new IllegalArgumentException("Invalid account type: " + accountType);
        }
    }
}
