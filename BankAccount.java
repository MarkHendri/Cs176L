
public class BankAccount {
    private String account_name;
    private double balance;
    
    public BankAccount() {
        this.account_name = "Your Name";
        this.balance = 0.0;
    }

    public BankAccount(double balance) {
        this.account_name = "Your Name";
        this.balance = balance;
    }

    public BankAccount(String account_name, double balance) {
        this.account_name = account_name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Wrong deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("No funds or withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
    
    public String getName() {
    	return account_name;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(1000.0);
        BankAccount account3 = new BankAccount("Mark Hendri ", 10000.0);

        System.out.println("Account 1 balance: $" + account1.getBalance());
        System.out.println("Account 2 balance: $" + account2.getBalance());
        System.out.println("Account 3 balance: $" + account3.getBalance());

        account1.deposit(900.0);
        account2.withdraw(500.0);
        account3.deposit(200.0);

        System.out.println("Account 1 balance after deposit: $" + account1.getBalance());
        System.out.println("Account 2 balance after withdrawal: $" + account2.getBalance());
        System.out.println("Account 3 balance after deposit: $" + account3.getBalance());
    }
}

