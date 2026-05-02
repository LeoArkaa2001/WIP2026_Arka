package AprilBatch_day2;

public class factorialOfNum {
	 public static void main(String[] args) {
	        int num = 5, fact = 1, i = 1;

	        while (i <= num) {
	            fact *= i;
	            i++;
	        }

	        System.out.println("Factorial: " + fact);
	    }

}
