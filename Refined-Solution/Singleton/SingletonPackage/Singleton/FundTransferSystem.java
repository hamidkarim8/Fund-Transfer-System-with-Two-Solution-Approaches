package Singleton;

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

        //instantiate the objects
        TransactionManager transactionManager = TransactionManager.getInstance();
        TransactionManager transactionManager2 = TransactionManager.getInstance();
    
        // Process the transactions if user is logged in
        if (user1.isLoggedIn()) {

            //perform transaction 1
            if(transactionManager.startTransaction(transaction1)){

                transactionManager.processCurrentTransaction();

                // Demonstration if the transaction 2 happen when the transaction did not finished yet
                // Perform fund transfer transaction 2
                if(transactionManager2.startTransaction(transaction1)){//here the startTransaction returned false bcs the instance still hold the value of isTransactionInProgress = true
                    
                    transactionManager2.processCurrentTransaction();
                    
                    // Print updated balances
                    System.out.println("\nUpdated balances after transaction 2:");
                    System.out.println(accountSavingUser1.printBalance());
                    System.out.println(accountCurrentUser2.printBalance());

                } else {
                    System.out.println("Transaction in progress. Please try again later.");
                }

                // Print updated balances
                System.out.println("\nUpdated balances after transaction 1:");
                System.out.println(accountSavingUser1.printBalance());
                System.out.println(accountCurrentUser2.printBalance());

                
                transactionManager.endTransaction(); //set the isTransactionInProgress false

            } else {
                System.out.println("Transaction in progress. Please try again later.");
            }

        } else {
            System.out.println("User not logged in. Please login to perform transactions.");
        }
    
        // Logout user1
        user1.logout();
    }
    
}
