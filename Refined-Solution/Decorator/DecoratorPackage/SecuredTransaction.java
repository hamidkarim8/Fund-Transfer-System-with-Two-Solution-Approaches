package DecoratorPackage;

public class SecuredTransaction implements Transaction {
    private String transactionId;
    private String encryptedSourceAccountNumber;
    private String encryptedDestinationAccountNumber;
    private double amount;
    
    public SecuredTransaction(String transactionId, String encryptedSourceAccountNumber, String encryptedDestinationAccountNumber, double amount) {
        this.transactionId = transactionId;
        this.encryptedSourceAccountNumber = encryptedSourceAccountNumber;
        this.encryptedDestinationAccountNumber = encryptedDestinationAccountNumber;
        this.amount = amount;
    }

    public void processTransaction() {
        System.out.println("Processing base transaction...\n");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Source Account: " + encryptedSourceAccountNumber);
        System.out.println("Destination Account: " + encryptedDestinationAccountNumber);
        System.out.println("Amount: RM" + amount);
        System.out.println("\nSecured transaction processed successfully.\n");
    }

    public String getEncryptedSourceAccountNumber() {
        return encryptedSourceAccountNumber;
    }

    public void setEncryptedSourceAccountNumber(String encryptedSourceAccountNumber) {
        this.encryptedSourceAccountNumber = encryptedSourceAccountNumber;
    }

    public String getEncryptedDestinationAccountNumber() {
        return encryptedDestinationAccountNumber;
    }

    public void setEncryptedDestinationAccountNumber(String encryptedDestinationAccountNumber) {
        this.encryptedDestinationAccountNumber = encryptedDestinationAccountNumber;
    }
}

