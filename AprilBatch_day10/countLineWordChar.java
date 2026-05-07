package AprilBatch_day10;
import java.io.*;

public class countLineWordChar {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int lines = 0;
        int words = 0;
        int characters = 0;

        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            characters += line.length();

            String[] wordList = line.split("\\s+");
            words += wordList.length;
        }

        br.close();

        System.out.println("Number of lines: " + lines);
        System.out.println("Number of words: " + words);
        System.out.println("Number of characters: " + characters);
    }
}
