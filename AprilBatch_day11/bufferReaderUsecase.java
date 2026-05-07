package AprilBatch_day11;

import java.io.*;

public class bufferReaderUsecase {

    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("sai.txt"));
            
            bw.write("Hello Java IO");
            bw.newLine(); 
            bw.write("This file is created by java program");
            
            bw.close();
            System.out.println("File written successfully");

        } catch (IOException e) {
            System.out.println("Error occurred while writing: " + e.getMessage());
        }

      
        try {
            BufferedReader br = new BufferedReader(new FileReader("sai.txt"));
            
            String line;
            System.out.println("\nReading file content:");
            
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();

        } catch (IOException e) {
            System.out.println("Error occurred while reading: " + e.getMessage());
        }
    }
}
