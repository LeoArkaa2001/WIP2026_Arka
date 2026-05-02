package AprilBatch_day2;

public class shoppingDiscount {
	public static void main(String[] args) {
        
        int amount = 3000;
        int discount = 0;

        if (amount >= 5000) {
            discount = 20;
        } else if (amount >= 2000) {
            discount = 10;
        } else if (amount >= 1000) {
            discount = 5;
        } else {
            System.out.println("No discount available.");
        }
            System.out.println("Discount: " + discount + "%");
           
    }

}
