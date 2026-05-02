package AprilBatch;
import java.util.*;
public class interestCal {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);    
	        double principal = sc.nextDouble();
	        double rate = sc.nextDouble();
	        double time = sc.nextDouble();
	        double simpleInterest = (principal * rate * time) / 100;
	        double totalAmount = principal + simpleInterest;

	       
	        System.out.println("Total Amount : ₹" + totalAmount);
	        
	        sc.close();
	    }

}
