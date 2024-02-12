package FactoryPackage;

public class FundTransferSystem {
    public static void main(String[] args) {
        // Create a new user using the factory method (refined solution)
        UserFactory userFactory = new UserFactory();
        User user = userFactory.createUser("hamid", "password123", "hamid@gmail.com");

        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
           
    
        // Create a Saving account using the factory method (refined solution)
        AccountFactory accountFactory = new AccountFactory();
        Account savingAccount = accountFactory.createAccount("saving", "123456789", 1000.0, user);

        //check type of account
        System.out.println("Account Type: "+savingAccount.getAccountType());
    }
}
