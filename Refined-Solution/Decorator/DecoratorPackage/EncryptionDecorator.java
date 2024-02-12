package DecoratorPackage;

import java.util.Random;

public class EncryptionDecorator implements Transaction {
    private Transaction decoratedTransaction;
    
    public EncryptionDecorator(Transaction decoratedTransaction) {
        this.decoratedTransaction = decoratedTransaction;
    }

    public void processTransaction() {
        System.out.println("Encrypting transaction data...\n");
        
        // Encrypt account numbers before processing the transaction
        String encryptedSourceAccountNumber = encryptData(((SecuredTransaction)decoratedTransaction).getEncryptedSourceAccountNumber());
        String encryptedDestinationAccountNumber = encryptData(((SecuredTransaction)decoratedTransaction).getEncryptedDestinationAccountNumber());
        
        // Update the secured transaction with encrypted account numbers
        ((SecuredTransaction)decoratedTransaction).setEncryptedSourceAccountNumber(encryptedSourceAccountNumber);
        ((SecuredTransaction)decoratedTransaction).setEncryptedDestinationAccountNumber(encryptedDestinationAccountNumber);
        
        // Call the processTransaction method of the decorated transaction
        decoratedTransaction.processTransaction();
    }
    
    private String encryptData(String data) {
        Random random = new Random();
        StringBuilder encryptedData = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            // Generate a random ASCII character in the range 32-126 (printable characters)
            char encryptedChar = (char) (random.nextInt(95) + 32);
            encryptedData.append(encryptedChar);
        }
        return encryptedData.toString();
    }
}