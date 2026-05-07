package AprilBatch_day10;
import java.io.*;
import java.util.Scanner;

public class appendToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt", true); 
        BufferedWriter bw = new BufferedWriter(fw);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to append: ");
        String input = sc.nextLine();

        bw.write(input);
        bw.newLine();

        bw.close();
        sc.close();

        System.out.println("Data appended successfully.");
    }
}
