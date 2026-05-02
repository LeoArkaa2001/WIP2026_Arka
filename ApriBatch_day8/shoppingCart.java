package ApriBatch_day8;
import java.util.*;

public class shoppingCart {
    public static void main(String[] args) {
        // Product -> Price
        Map<String, Double> productPrice = new HashMap<>();
        productPrice.put("Book", 200.0);
        productPrice.put("Pen", 20.0);
        productPrice.put("Notebook", 50.0);

        // Cart (List of products)
        List<String> cart = new ArrayList<>();
        cart.add("Book");
        cart.add("Pen");
        cart.add("Notebook");

        double total = 0;

        for (String item : cart) {
            total += productPrice.get(item);
        }

        System.out.println("Total price: " + total);
    }
}
