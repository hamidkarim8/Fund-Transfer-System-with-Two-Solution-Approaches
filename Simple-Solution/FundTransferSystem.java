// Main application logic
public class FundTransferSystem {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("user1", "password1", "user1@gmail.com");
        User user2 = new User("user2", "password2", "user2@gmail.com");

        // Create accounts for users
        // Creating Saving account
        Account accountSavingUser1 = new Saving("123456789", 1000.0, user1);

        // Creating Current account
        Account accountCurrentUser2 = new Current("987654321", 500.0, user2);

        // Login user1
        user1.login("password1");

        // Perform fund transfer transaction 1
        Transaction transaction1 = new Transaction(
                "T123",
                accountSavingUser1,
                accountCurrentUser2,
                200.0
        );
        // Perform fund transfer transaction 2
        Transaction transaction2 = new Transaction(
                "T345",
                accountSavingUser1,
                accountCurrentUser2,
                10.0
        );

        // Print initial balances
        System.out.println("Initial balances:");
        System.out.println(accountSavingUser1.printBalance());
        System.out.println(accountCurrentUser2.printBalance());

        // Process the transaction if user is logged in
        if (user1.isLoggedIn()) {
            //2 transactions run at one time
            transaction1.processTransaction();
            transaction2.processTransaction();

            // Print updated balances
            System.out.println("\nUpdated balances after 2 transactions:");
            System.out.println(accountSavingUser1.printBalance());
            System.out.println(accountCurrentUser2.printBalance());
        } else {
            System.out.println("User not logged in. Please login to perform transactions.");
        }

        // Logout user1
        user1.logout();
    }
}
