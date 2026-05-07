package AprilBatch_day12;
import java.io.FileReader;
import java.io.IOException;

public class readFileDemo {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("sai.txt")) {
            
            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch); 
            }

        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
