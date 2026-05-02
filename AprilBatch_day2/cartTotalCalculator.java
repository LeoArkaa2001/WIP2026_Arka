package AprilBatch_day2;

public class cartTotalCalculator {
	public static void main(String[] args) {
        int[] prices = {120, 250, 80, 399, 0};
        int total = 0;
        int i = 0;

        while (prices[i] != 0) {
            total += prices[i];
            System.out.println("Added Rs. " + prices[i] + "  Running Total: Rs. " + total);
            i++;
        }

        System.out.println("Total Bill: Rs. " + total);
    }

}
