package DecoratorPackage;

public class BasicTransaction implements Transaction {
    private String transactionId;
    private String sourceAccountNumber;
    private String destinationAccountNumber;
    private double amount;

    public BasicTransaction(String transactionId, String sourceAccountNumber, String destinationAccountNumber, double amount) {
        this.transactionId = transactionId;
        this.sourceAccountNumber = sourceAccountNumber;
        this.destinationAccountNumber = destinationAccountNumber;
        this.amount = amount;
    }

    public void processTransaction() {
        System.out.println("Processing base transaction...\n");
        System.out.println("Secured transaction processed successfully.\n");
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSourceAccountNumber() {
        return sourceAccountNumber;
    }

    public void setSourceAccountNumber(String sourceAccountNumber) {
        this.sourceAccountNumber = sourceAccountNumber;
    }

    public String getDestinationAccountNumber() {
        return destinationAccountNumber;
    }

    public void setDestinationAccountNumber(String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}