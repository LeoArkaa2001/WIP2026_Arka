package AprilBatch_day12;
import java.io.*;

public class foodDeliveryApplication {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("food_orders.txt", true)) {
            fw.write("Order: Pizza\nCustomer: Amit\nStatus: Delivered\n");
            System.out.println("Order stored!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
