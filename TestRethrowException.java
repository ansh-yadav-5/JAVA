public class TestRethrowException {
    public static void main(String[] args) {
        System.out.println("Inside main");
        try {
            divide(10.5,20);
            divide(20.0,0.0);
        } catch (Exception ex) {
            System.out.println("Catch exception in main");
        }
        System.out.println("Continue exception...");
    }
    public static void divide (double x, double y) throws Exception {
        System.out.println("Inside Function");

        try {
            if (y == 0.0) {
                throw new ArithmeticException("Cannot divide by zero");
            } else {
                System.out.println("Division is " + (x/y));
            }
        } catch (Exception ex) {
            System.out.println("Catch exception in function");
            throw new Exception("Error not resolved");
        }
        System.out.println("End function\n");
    }
}
