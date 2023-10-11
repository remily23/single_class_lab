public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String accountNumber;
    private double balance;
    private String accountType;
    private double overdraft;

    // Constructor
    public BankAccount(String firstName, String lastName, String dateOfBirth, String accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // new bank account set at 0 before any deposits
        this.accountType = accountType;
        this.overdraft = overdraft;
    }

    // First name Getter
    public String getFirstName(){
        return this.firstName;
    }
    // First name Setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // Last name Getter
    public String getLastName(){
        return lastName;
    }

    // Second name Setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Date of Birth Getter
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    // Date of Birth Setter
    public void setDateOfBirth (String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Account Number Getter
    public String getAccountNumber(){
        return accountNumber;
    }

    // Account number Setter
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Balance Getter
    public double getBalance(){
        return this.balance = balance;
    }

    // Balance Setter
    public void setBalance(double balance){
        this.balance = balance;
    }

    // accountType Getter
    public String getAccountType(String accountType) {
        return accountType = accountType;
    }

    // accountType Setter
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    // overdraft Getter
    public double getOverdraft() {
        return overdraft;
    }

    // overdraft Setter
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    // Depositing money method
    public void deposit(double amount) {
        if (amount > 0){ // takes in amount
            balance += amount; // updates the balance of BankAccount
        }
    }

    // Withdrawing money method
    public void withdraw(double amount){
        balance -= amount;
    }

    // Displaying account details method
    public void displayAccountData(){
        System.out.println("Account Owner: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Balance: £" + balance);
    }

    public static void main(String[] args){
        BankAccount account = new BankAccount("Emily", "Pink", "01.12.1970", "1234567");
        account.deposit(100.00);
        account.withdraw(20.00);
        account.displayAccountData();
    }

    // Pay 5% interest to the account balance
    public void payInterest(){
        double interest = balance * 0.05; // determines 5% of the current account balance
        balance += interest; // +=
    }

}