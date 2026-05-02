package AprilBatch_day4;
import java.util.*;
public class arrayDescending {
	 public static void main(String[] args) {
	        Integer[] arr = {5, 2, 9, 1, 6};

	        Arrays.sort(arr, Collections.reverseOrder());
	        System.out.println("Descending: " + Arrays.toString(arr));
	    }

}
