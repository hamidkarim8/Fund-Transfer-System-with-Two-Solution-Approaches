public abstract class Account {
  private String accountNumber;
  private double balance;
  private User user;

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public String printBalance() {
    return "Balance " + getAccountType() + " of " + getUser() + ": RM" + getBalance();
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getUser() {
    return user.getUsername();
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Account(String accountNumber, double balance, User user) {
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.user = user;
  }

  public abstract String getAccountType();

  public void deposit(double amount) {
      balance += amount;
  }

  public void withdraw(double amount) {
      if (balance >= amount) {
          balance -= amount;
      } else {
          System.out.println("Insufficient funds.");
      }
  }
}