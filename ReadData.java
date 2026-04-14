import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("1.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int Score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + Score);
        }
        input.close();
    }
}
