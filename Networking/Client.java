
import java.io.*;
import java.net.*;
import java.io.DataOutputStream;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("0.0.0.0",8000);
        DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
        DataInputStream fromServer = new DataInputStream(socket.getInputStream());

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter radius ");
            double r = input.nextDouble();
            
            try {
                double radius = r;
                toServer.writeDouble(radius);
                toServer.flush();
                double area = fromServer.readDouble();
                System.out.println("Area recieved " + area);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            
        }
    }
}
