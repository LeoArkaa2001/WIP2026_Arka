package AprilBatch_day2;
import java.util.*;
public class vowelOrConstantUsingSwitch {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        char ch = sc.next().toLowerCase().charAt(0);

	        switch (ch) {
	            case 'a': case 'e': case 'i': case 'o': case 'u': {
	                System.out.println("Vowel");
	                break;
	            }
	            default: {
	                System.out.println("Consonant");
	            }
	        }
	        sc.close();
	    }
}


