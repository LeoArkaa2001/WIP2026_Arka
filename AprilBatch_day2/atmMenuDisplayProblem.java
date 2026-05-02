package AprilBatch_day2;
import java.util.*;
public class atmMenuDisplayProblem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Balance: " + balance);
                break;
            }
            case 2: {
                System.out.print("Enter amount: ");
                int amount = sc.nextInt();
                balance += amount;
                System.out.println("Updated Balance: " + balance);
                break;
            }
            case 3: {
                System.out.print("Enter amount: ");
                int amount = sc.nextInt();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Remaining Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            }
            case 4: {
                System.out.println("Exit");
                break;
            }
            default: {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }

}
