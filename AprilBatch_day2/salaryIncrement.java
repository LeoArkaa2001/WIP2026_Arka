package AprilBatch_day2;

public class salaryIncrement {
	public static void main(String[] args) {
        String[] names = {"Arka", "Pritam", "Kaushik"};
        int[] salaries = {30000, 50000, 60000};
        int incrementPercent = 10;

        for (int i = 0; i < names.length; i++) {
            int newSalary = salaries[i] + (salaries[i] * incrementPercent / 100);
            System.out.println(names[i] + " New Salary " + newSalary);
        }
    }

}
