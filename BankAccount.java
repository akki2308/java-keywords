class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "ABC Bank";
    private static int totalAccounts = 0;
    
    // Final variable to ensure account number cannot be changed
    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    
    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; // Increment total accounts
    }
    
    // Static method to get total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) { // instanceof check
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid account object");
        }
    }
    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John Doe", 1001, 5000.00);
        BankAccount acc2 = new BankAccount("Jane Smith", 1002, 7000.50);
        
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        
        // Display total accounts
        BankAccount.getTotalAccounts();
    }
}
