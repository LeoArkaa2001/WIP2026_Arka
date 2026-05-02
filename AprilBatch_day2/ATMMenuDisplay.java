package AprilBatch_day2;

public class ATMMenuDisplay {
	public static void main(String[] args) {
        int[] choices = {1, 2, 3, 4}; 
        int i = 0;
        do {
            System.out.println("\n ATM Menu ");
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            int choice = choices[i++];
            System.out.println("Selected: " + choice);

            switch (choice) {
                case 1 -> System.out.println("Your balance is ₹5000");
                case 2 -> System.out.println("Amount deposited");
                case 3 -> System.out.println("Amount withdrawn");
                default -> System.out.println("Exit");
            }

            if (choice == 3) break;

        } while (i < choices.length);
    }

}
