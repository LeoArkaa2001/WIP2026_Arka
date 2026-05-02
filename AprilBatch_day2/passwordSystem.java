package AprilBatch_day2;

public class passwordSystem {
	public static void main(String[] args) {
        String correctPassword = "java123";
        String[] attempts = {"wrong1", "wrong2", "java123"};
        int maxAttempts = 3;
        boolean success = false;

        for (int i = 0; i < maxAttempts; i++) {
            if (attempts[i].equals(correctPassword)) {
                System.out.println("Access granted on attempt " + (i + 1));
                success = true;
                break;
            } else {
                System.out.println("Wrong password. Attempts left: " + (maxAttempts - i - 1));
            }
        }

        if (!success) {
            System.out.println("Account locked. Too many failed attempts.");
        }
    }

}
