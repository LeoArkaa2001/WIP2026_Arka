package AprilBatch_day2;

public class ifElse_exmpl {
	static int age = 20;                            //age can only be acquired in main if Static initialization
	public static void main (String [] args) {      // is done. or we can write age inside main method
		if(age >= 18){
			System.out.println("Eligible for vote");
		}else {
			System.out.println("Not Eligible for vote");
		}
	}

}
