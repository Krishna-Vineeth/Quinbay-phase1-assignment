import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver {
    public static void main(String[] args) {
        try 
        {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is listening on port 5000...");

            Socket socket = ss.accept();
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String message = reader.readLine();
            System.out.println("I received this message: " + message);

            socket.close();
            ss.close();
        } 
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
