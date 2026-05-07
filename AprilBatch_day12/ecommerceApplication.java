package AprilBatch_day12;
import java.io.*;

public class ecommerceApplication {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("orders.txt")) {
            fw.write("OrderID: 101\nProduct: Laptop\nAddress: Kolkata\n");
            fw.write("Invoice: Paid\n");
            System.out.println("Order saved!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
