package AprilBatch_day10;
import java.io.*;

public class bufferedReaderUsage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            if (line.toLowerCase().contains("java")) {
                System.out.println(line);
            }
        }

        br.close();
    }
}