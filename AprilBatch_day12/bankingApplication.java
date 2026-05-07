package AprilBatch_day12;
import java.io.*;

public class bankingApplication {
    public static void main(String[] args) {

      
        try (FileWriter fw = new FileWriter("transactions.txt", true)) {
            fw.write("Deposit: 5000\n");
            fw.write("Withdraw: 2000\n");
        } catch (IOException e) {
            System.out.println(e);
        }

      
        try (BufferedReader br = new BufferedReader(new FileReader("transactions.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
