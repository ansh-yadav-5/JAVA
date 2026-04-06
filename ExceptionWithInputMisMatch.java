import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionWithInputMisMatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an Integer : ");
                int number = input.nextInt();
                System.out.println("the number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again.(Incorrect input: a integer is required )");
                input.nextLine();
            }
        } while (continueInput);
    }
}
