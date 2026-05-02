package AprilBatch_day2;

public class loginValidation {
	 public static void main(String[] args) {
	        String correctUser = "arka";
	        String correctPass = "1234";
 
	        String user = "arka";
	        String pass = "1234";

	        if (user.equals(correctUser) && pass.equals(correctPass)) {
	            System.out.println("Login Successful!");
	        } else {
	            System.out.println("Login Failed!");
	        }
	    }

}
