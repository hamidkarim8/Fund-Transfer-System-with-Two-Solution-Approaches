public class Transaction {

    private String transactionId;
    private Account sourceAccountNumber;
    private Account destinationAccountNumber;
    private double amount;
  

    public Transaction(
        String transactionId,
        Account sourceAccountNumber,
        Account destinationAccountNumber,
        double amount
      ) {
        this.transactionId = transactionId;
        this.sourceAccountNumber = sourceAccountNumber;
        this.destinationAccountNumber = destinationAccountNumber;
        this.amount = amount;
      }
    
    public void processTransaction() {
          // Withdraw amount from the source account
          sourceAccountNumber.withdraw(amount);
          
          // Deposit amount into the destination account
          destinationAccountNumber.deposit(amount);      
          System.out.println("\nTransaction processed successfully.");
      }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSourceAccountNumber() {
        return sourceAccountNumber.getAccountNumber();
    }


    public String getDestinationAccountNumber() {
        return destinationAccountNumber.getAccountNumber();
    }





  }
