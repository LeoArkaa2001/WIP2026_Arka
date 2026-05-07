package AprilBatch_day11;
import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        String str = "programming";

        Set<Character> set = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
