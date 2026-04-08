public class TestMultipleCatch {
    public static void main(String[] args) {
        int[] a = {5,10};
        int b = 5;

        try {
            int x = a[2]/b-a[1];
            System.out.println(" y= " + x);
        }catch(ArithmeticException e){
            System.out.println(" Division by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error");
        }catch(ArrayStoreException e){
            System.out.println("Wrong data type ");
        }
    }
}
