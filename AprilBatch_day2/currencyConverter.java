package AprilBatch_day2;
import java.util.*;
public class currencyConverter {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. INR to USD\n2. INR to EUR");
        int choice = sc.nextInt();
        double amount = sc.nextDouble();

        switch (choice) {
            case 1: {
                System.out.println("USD: " + (amount / 83));
                break;
            }
            case 2: {
                System.out.println("EUR: " + (amount / 90));
                break;
            }
            default: {
                System.out.println("Invalid choice");
            }
        }sc.close();
    }
	
}