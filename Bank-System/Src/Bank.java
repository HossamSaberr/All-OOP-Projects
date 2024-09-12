public class Bank {
    private static Account[] accounts;
    private static int accounts_num;
    public Bank(int num) {
        accounts = new Account[num];
        accounts_num = 0;
    }
    public static void addAccount(Account account) {
        if (accounts_num < accounts.length) {
            accounts[accounts_num] = account;
            accounts_num++;
            System.out.println("Account added successfully : " + account.getAccountNumber());
        }
        else {
            System.out.println("Sorry, Cant add more accounts for now.");
        }
    }
    public static Account findAccount(String num) {
        for (int i = 0; i < accounts_num; i++) {
            if(accounts[i].getAccountNumber().equals(num)) {
                return accounts[i];
            }
        }
        return null;
    }
    public static void displayBalance (String num) {
        Account account = findAccount(num);
        if(account != null) {
            System.out.println("Your Balance : " + account.getBalance());
        }
        else {
            System.out.println("Account not found.");
        }
    }
}
