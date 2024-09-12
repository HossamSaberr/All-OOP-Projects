public class Account {
    private String accountNumber;
    private String nameholder;
    protected double balance;
    public Account(String num , String name , double balance) {
        this.accountNumber = num;
        this.nameholder = name;
        this.balance = balance;
    }
    public void Depositing(double money)  {
        if(money > 0) {
            balance += money;
            System.out.println("Depostied : " + money);
            System.out.println("Your balance now is : " + balance);
        }
        else {
            System.out.println("Invalid. Please enter positive number.");
        }
    }
    public void Withdraw(double money)  {
        if(money > 0 && money <= balance) {
            balance -= money;
            System.out.println("Withdrew : " + money);
            System.out.println("Your balance now is : " + balance);
        }
        else {
            System.out.println("Invalid. Please enter number not bigger than your balance.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getNameholder() {
        return nameholder;
    }
}
