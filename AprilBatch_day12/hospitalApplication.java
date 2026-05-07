package AprilBatch_day12;
import java.io.*;

public class hospitalApplication {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("patients.txt")) {
            fw.write("Patient: Renu\nDisease: Fever\nDoctor: Dr. Roy\n");
            System.out.println("Patient record saved!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
