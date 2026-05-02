package AprilBatch_day2;

public class palindromeCheck {
	public static void main(String[] args) {
        int num = 121, og = num, rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (og == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
