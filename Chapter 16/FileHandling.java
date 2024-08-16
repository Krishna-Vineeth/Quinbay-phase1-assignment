import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        
        File file = new File("sample.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, I am krishna Vineeth");
            writer.close();

            System.out.println("File written successfully.");
        } 
        
        catch (IOException e) 
        {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

    
        try {
            FileReader reader = new FileReader(file);
            int character;
            System.out.println("File content:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();
        } 
        
        catch (IOException e) 
        {
            System.out.println("An error occurred while reading the file.");
            
            e.printStackTrace();
        }
    }
}
