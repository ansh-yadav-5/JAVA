import java.util.Scanner;

public class ExceptionWithQuotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers :");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        try {
            int r = n1/n2;
            System.out.println(n1 + " / " + n2 + " is " + r);
        } catch (ArithmeticException ex) {
            System.out.println("Exception an integer cannot be divided by zero ");
        }
        System.out.println("Execution continues...");
    }
}
