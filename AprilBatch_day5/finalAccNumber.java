package AprilBatch_day5;

class BankAccount {
    private final String accountNumber;  
    private String customerName;

    
    public BankAccount(String accountNumber, String customerName) {          
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
    }
}

public class finalAccNumber {
	 public static void main(String[] args) {
	        BankAccount acc = new BankAccount("ACC12345", "Rahul");

	        acc.displayDetails();
	 }

}
