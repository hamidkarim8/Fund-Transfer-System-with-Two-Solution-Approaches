package Singleton;

public class TransactionManager {
    private static TransactionManager instance;
    private static boolean isTransactionInProgress;
    private Transaction tr;

    private TransactionManager() {
        isTransactionInProgress = false;
    }

    public static TransactionManager getInstance() {
        if (instance == null) {
            instance = new TransactionManager();
        }
        return instance;
    }

    public boolean startTransaction(Transaction transaction) {
        if (!isTransactionInProgress) {
            isTransactionInProgress = true;
            this.tr = transaction;
            return true;
        }
        //else isTransactionInProgress = true, then
        return false;
    }

    public void processCurrentTransaction() {
        if (this.tr != null) {
            this.tr.processTransaction();
        }
    }

    public void endTransaction() {
        this.tr = null;
        isTransactionInProgress = false;
    }

    public boolean isTransactionInProgress() {
        return isTransactionInProgress;
    }
}

