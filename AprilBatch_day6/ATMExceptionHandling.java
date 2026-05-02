package AprilBatch_day6;

class ATM {
    private static final int CORRECT_PIN = 1234;

    public void insertCard(int enteredPIN) {
        System.out.println("Card inserted.");

        try {
            if (enteredPIN != CORRECT_PIN) {
                throw new Exception("Wrong PIN!");
            }

            System.out.println("PIN accepted. Access granted!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Transaction ended.\n");
        }
    }
}


public class ATMExceptionHandling {
    public static void main(String[] args) {
        ATM atm = new ATM();

        System.out.println("1st Attempt:");
        atm.insertCard(9999);   

        System.out.println("2nd Attempt:");
        atm.insertCard(1234);   
    }
}