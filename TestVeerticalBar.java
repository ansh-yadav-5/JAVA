public class TestVeerticalBar {
    public static void main(String[] args) {
        int [] a = {5,10};
        int b = 5;
        try{
            int x = a[2]/b-a[1];
            System.out.println("y= " + x);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException | ArrayStoreException e){
            System.out.println("Something went wrong");
        }
    }
}
