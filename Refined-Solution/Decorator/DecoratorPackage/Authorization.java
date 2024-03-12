package DecoratorPackage;

public class Authorization implements Transaction {
    private Transaction decoratedTransaction;
    
    public Authorization(Transaction decoratedTransaction) {
        this.decoratedTransaction = decoratedTransaction;
    }

    public void processTransaction() {
        System.out.println("\nAuthorizing transaction...\n");
        // Additional authorization logic can be added here
        
        // Call the processTransaction method of the decorated transaction
        decoratedTransaction.processTransaction();
    }
}
