package AprilBatch_day11;
import java.util.*;

public class maxFreaquency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxElement = arr[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println("Element with maximum frequency: " + maxElement);
    }
}
