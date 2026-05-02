package AprilBatch_day2;

public class fibonacciUsingWhile {
	public static void main(String[] args) {
        int n = 10, a = 0, b = 1, i = 1;

        while (i <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
    }

}
