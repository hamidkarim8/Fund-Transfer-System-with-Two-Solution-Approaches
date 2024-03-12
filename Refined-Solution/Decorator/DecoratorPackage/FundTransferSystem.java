package DecoratorPackage;

// Main application logic
public class FundTransferSystem {
    public static void main(String[] args) {
        // Create base transaction
        Transaction basicTransaction = new BasicTransaction("T123", "123456789", "987654321", 200.0);

        // Decorate transaction with encryption and authorization
        Encryption encryptedTransaction = new Encryption(basicTransaction);
        Authorization authorizedTransaction = new Authorization(encryptedTransaction);
        
        // Process the decorated transaction
        authorizedTransaction.processTransaction();
    }
}
