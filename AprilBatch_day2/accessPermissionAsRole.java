package AprilBatch_day2;
import java.util.*;
public class accessPermissionAsRole {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String role = sc.next();

	        switch (role) {
	            case "Admin": {
	                System.out.println("Full Access");
	                break;
	            }
	            case "User": {
	                System.out.println("Limited Access");
	                break;
	            }
	            case "Guest": {
	                System.out.println("View Only");
	                break;
	            }
	            default: {
	                System.out.println("Invalid Role");
	            }
	        }
	        sc.close();
	    }

}
