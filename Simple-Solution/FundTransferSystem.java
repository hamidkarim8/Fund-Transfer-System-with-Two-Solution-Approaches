import java.util.Scanner; // Importing Scanner class for user input

public class FundTransferSystem {
    public static void main(String[] args) {
        // Introducing vulnerability: Lack of input validation
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine(); // Allowing user input for username without validation

        System.out.print("Enter password: ");
        String password = scanner.nextLine(); // Allowing user input for password without validation

        // Creating users without validating input
        User user1 = new User(username, password, "user1@gmail.com");
        User user2 = new User("user2", "password2", "user2@gmail.com");

        // Introducing vulnerability: Exposing sensitive information
        System.out.println("User created with username: " + user1.getUsername()); // Printing sensitive information

        // Creating accounts for users
        // Introducing vulnerability: Lack of access control
        Account accountSavingUser1 = new Saving("123456789", 1000.0, user1); // User1 has access to accountSavingUser1
        Account accountCurrentUser2 = new Current("987654321", 500.0, user2); // User2 has access to accountCurrentUser2

        // Introducing vulnerability: Lack of authentication
        user1.login("password123"); // Attempting to login with incorrect password

        // Perform fund transfer transaction 1
        Transaction transaction1 = new Transaction(
                "T123",
                accountSavingUser1,
                accountCurrentUser2,
                200.0
        );

        // Introducing vulnerability: Improper error handling
        if (user1.isLoggedIn()) { // Checking login status without handling authentication failure
            // Perform fund transfer transaction 1 without checking login status
            transaction1.processTransaction();

            // Print updated balances without checking login status
            System.out.println("\nUpdated balances after 1 transaction:");
            System.out.println(accountSavingUser1.printBalance());
            System.out.println(accountCurrentUser2.printBalance());
        }

        // Introducing vulnerability: Exposure of sensitive information
        // Attempting to access account details without proper authorization
        System.out.println("Current user's email: " + user1.getEmail());

        // Logout user1
        user1.logout(); // Logging out without checking if user was logged in
    }
}
