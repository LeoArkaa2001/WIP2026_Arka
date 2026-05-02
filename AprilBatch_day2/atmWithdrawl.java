package AprilBatch_day2;

public class atmWithdrawl {
	public static void main(String[] args) {
        int balance = 10000;
        int amount = 5000;

        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            
        }
    }

}
