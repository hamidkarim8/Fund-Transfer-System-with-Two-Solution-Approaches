package DecoratorPackage;

// Main application logic
public class FundTransferSystem {
    public static void main(String[] args) {
        // Create base transaction
        Transaction securedTransaction = new SecuredTransaction("T123", "123456789", "987654321", 200.0);

        // Decorate transaction with encryption and authorization
        EncryptionDecorator encryptedTransaction = new EncryptionDecorator(securedTransaction);
        AuthorizationDecorator authorizedTransaction = new AuthorizationDecorator(encryptedTransaction);
        
        // Process the decorated transaction
        authorizedTransaction.processTransaction();
    }
}
