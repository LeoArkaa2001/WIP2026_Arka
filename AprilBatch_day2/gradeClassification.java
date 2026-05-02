package AprilBatch_day2;

public class gradeClassification {
	public static void main(String[] args) {
        
        int marks = 95;
        if (marks >= 90) {
            System.out.println(" A+");
        } else if (marks >= 75) {
            System.out.println(" A ");
        } else if (marks >= 60) {
            System.out.println(" B ");
        } else if (marks >= 45) {
            System.out.println("C");
        } else if (marks >= 35) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}
