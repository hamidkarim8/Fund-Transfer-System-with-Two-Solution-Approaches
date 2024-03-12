package DecoratorPackage;

import java.util.Random;

public class Encryption extends TransactionDecorator {

    public Encryption(Transaction decoratedTransaction) {
        super(decoratedTransaction); // Properly set the decoratedTransaction using the parent class constructor
    }

    @Override
    public void processTransaction() {
        System.out.println("Encrypting transaction data...\n");
    

        // Encrypt account numbers before processing the transaction
        String encryptedSourceAccountNumber = encryptData(((BasicTransaction)decoratedTransaction).getSourceAccountNumber());
        String encryptedDestinationAccountNumber = encryptData(((BasicTransaction)decoratedTransaction).getDestinationAccountNumber());
        
        // Update the secured transaction with encrypted account numbers
        ((BasicTransaction)decoratedTransaction).setSourceAccountNumber(encryptedSourceAccountNumber);
        ((BasicTransaction)decoratedTransaction).setDestinationAccountNumber(encryptedDestinationAccountNumber);
        
        // Call the processTransaction method of the decorated transaction
        decoratedTransaction.processTransaction();

        System.out.println("Transaction ID: " + ((BasicTransaction)decoratedTransaction).getTransactionId());
        System.out.println("Source Account: " + ((BasicTransaction)decoratedTransaction).getSourceAccountNumber());
        System.out.println("Destination Account: " + ((BasicTransaction)decoratedTransaction).getDestinationAccountNumber());
        System.out.println("Amount: RM" + ((BasicTransaction)decoratedTransaction).getAmount()+"\n");
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
