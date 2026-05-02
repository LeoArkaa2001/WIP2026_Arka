package ApriBatch_day8;
import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 4, 45, 99, 99);

        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
