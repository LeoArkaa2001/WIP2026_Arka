package AprilBatch;

import java.util.Scanner;

public class excercise2 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		float marks1, marks2, marks3, avg;
		
		
		name = sc.nextLine();
		age = sc.nextInt();
		marks1 = sc.nextFloat();
		marks2 = sc.nextFloat();
		marks3 = sc.nextFloat();
		
		
		avg = (marks1 + marks2 + marks3) / 3;
		System.out.println( " Name = " +name + " Age = " +age + " Average Marks = " + avg);
		sc.close();
		
   }

}
