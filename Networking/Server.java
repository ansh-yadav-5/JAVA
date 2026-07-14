
import java.net.*;
import java.io.*;


public class Server {
    public static void main(String[] args) throws Exception {
        try{
            ServerSocket serverSocket = new ServerSocket(8000);
            Socket socket = serverSocket.accept();
            DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
            DataOutputStream outputFromClient = new DataOutputStream(socket.getOutputStream());

            while (true) {
                double radius = inputFromClient.readDouble();
                double area = radius * radius * Math.PI;
                outputFromClient.writeDouble(area);
                System.out.println("Area is " + area);
            }
        }catch(IOException ex){
            System.out.println(ex);
        }
    }    
}
