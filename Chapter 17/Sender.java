import java.io.*;
import java.net.Socket;

public class Sender {
    public static void main(String[] args) {
        try 
        {
            Socket socket = new Socket("localhost", 5000);
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            writer.println("Hi, I am krishna Vineeth");

            socket.close();
        } 
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
