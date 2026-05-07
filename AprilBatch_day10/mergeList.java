package AprilBatch_day10;
import java.util.*;

public class mergeList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Arka");
        list1.add("Kaushik");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Kaushik");
        list2.add("Aarif");

        ArrayList<String> list3 = new ArrayList<>();

        
        for (String item : list1) {
            if (!list3.contains(item)) {
                list3.add(item);
            }
        }

        
        for (String item : list2) {
            if (!list3.contains(item)) {
                list3.add(item);
            }
        }

        System.out.println(list3);
    }
}
