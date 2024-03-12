package DecoratorPackage;

public abstract class TransactionDecorator implements Transaction {
    protected Transaction decoratedTransaction;

    public TransactionDecorator(Transaction decoratedTransaction) {
        this.decoratedTransaction = decoratedTransaction;
    }

    public void processTransaction() {
        decoratedTransaction.processTransaction();
    }
}
