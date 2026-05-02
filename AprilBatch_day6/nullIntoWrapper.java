package AprilBatch_day6;

public class nullIntoWrapper {
    public static void main(String[] args) {

        Integer num = null;
        Double price = null;

        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + price);

        String input = null;

        Integer value = (input != null) ? Integer.valueOf(input) : null;

        System.out.println("Converted value: " + value);
    }
}
