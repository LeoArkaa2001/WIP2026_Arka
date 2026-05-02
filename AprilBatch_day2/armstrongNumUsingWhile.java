package AprilBatch_day2;

public class armstrongNumUsingWhile {
	public static void main(String[] args) {
        int num = 153, og = num, sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == og) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }

}
