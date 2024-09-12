public class SavingAccount extends Account {
    private double interest;
    public SavingAccount(String num , String name , double balance , double x) {
        super(num, name, balance);
        this.interest = x;
    }
    public double calcInterest() {
        return balance * interest / 100;
    }
}
