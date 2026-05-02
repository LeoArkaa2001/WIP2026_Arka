package AprilBatch_day2;

public class foodOrdering {

	public static void main(String[] args) {

        int choice = 3; 

        switch (choice) {
            case 1:
                System.out.println("You ordered: Burger - Rs.80");
                break;
            case 2:
                System.out.println("You ordered: Pizza - Rs.150");
                break;
            case 3:
                System.out.println("You ordered: Pasta - Rs.120");
                break;
            case 4:
                System.out.println("You ordered: Sandwich - Rs.60");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

}
