public class Question31 {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public Question31(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; 
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        } else {
            System.out.println("Insufficient balance. Cannot withdraw $" + amount + " from account " + accountNumber);
        }
    }
    public double getBalance() {
        return balance;
    }
    public void getAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
    public static void main(String[] args) {   
        Question31 myAccount = new Question31("123456789", "Ansh Pandey");        
        myAccount.getAccountInfo(); 
        myAccount.deposit(1000.0); 
        myAccount.withdraw(500.0); 
        myAccount.getAccountInfo(); 
    }
}