import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File obj = new File("MyFile.txt");

            if (obj.createNewFile()) {
                System.out.println("File was created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to the file
            FileWriter writer = new FileWriter(obj);
            writer.write("Hello world java");
            writer.close();

            // Read the file
            Scanner reader = new Scanner(obj);  // Corrected Scanner usage

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();

            if (obj.delete()) {
                System.out.println("File is deleted.");
            } else {
                System.out.println("Error");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
