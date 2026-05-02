package AprilBatch_day4;
import java.util.*;
public class removeDuplicate {
	public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }

}
