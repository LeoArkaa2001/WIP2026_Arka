package AprilBatch;
import java.util.*;
public class CalSalary {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basic = sc.nextDouble();
        double bonus = sc.nextDouble();
        double tax = sc.nextDouble();

        double netSalary = basic + bonus - tax;

        System.out.println(" Net Salary: " + netSalary);

        sc.close();
	}

}
