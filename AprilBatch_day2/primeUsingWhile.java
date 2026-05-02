package AprilBatch_day2;

public class primeUsingWhile {
	public static void main(String[] args) {
        int num = 7, i = 2;
        boolean isPrime = true;

        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime && num > 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}
