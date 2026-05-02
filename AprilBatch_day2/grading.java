package AprilBatch_day2;
import java.util.*;
public class grading {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A': {
                System.out.println("Excellent");
                break;
            }
            case 'B': {
                System.out.println("Good");
                break;
            }
            case 'C': {
                System.out.println("Average");
                break;
            }
            case 'D': {
                System.out.println("Poor");
                break;
            }
            case 'F': {
                System.out.println("Fail");
                break;
            }
            default: {
                System.out.println("Invalid Grade");
            }
        }
        sc.close();
    }

}
