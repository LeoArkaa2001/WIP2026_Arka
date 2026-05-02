package AprilBatch_day2;

public class CartTillZero {
	public static void main(String[] args) {
        int[] prices = {150, 299, 89, 450, 0}; 
        int total = 0;

        System.out.println(" Shopping Cart ");
        int i = 0;
        while (prices[i] != 0) {
            System.out.println("Item price: " + prices[i]);
            total += prices[i];
            i++;
        }
        System.out.println("Total amount: " + total);
    }

}
