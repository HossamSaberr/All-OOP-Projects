import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank(666);
        while (true) {
            System.out.println("1. New savings account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Show balance");
            System.out.println("5. Exit");
            System.out.print("Choose option : ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter account number : ");
                    String accNum1 = input.next();
                    System.out.print("Enter account holder name : ");
                    String name = input.next();
                    System.out.print("Enter balance : ");
                    double balance = input.nextDouble();
                    System.out.print("Enter interest : ");
                    double interestRate = input.nextDouble();
                    SavingAccount savingsAccount = new SavingAccount(accNum1 , name , balance , interestRate);
                    bank.addAccount(savingsAccount);
                    break;
                case 2:
                    System.out.print("Enter account number : ");
                    String accNum2 = input.next();
                    Account acc = bank.findAccount(accNum2);
                    if (acc != null) {
                        System.out.print("Enter amount to deposit : ");
                        double depositAmount = input.nextDouble();
                        acc.Depositing(depositAmount);
                    }
                    else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number : ");
                    String accNum3 = input.next();
                    acc = bank.findAccount(accNum3);
                    if (acc != null) {
                        System.out.print("Enter budget to withdraw : ");
                        double withdrawAmount = input.nextDouble();
                        acc.Withdraw(withdrawAmount);
                    }
                    else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number : ");
                    String accNum4 = input.next();
                    bank.displayBalance(accNum4);
                    break;
                case 5:
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("Invalid. Please try again.");
            }
        }
    }
}