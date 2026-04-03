import java.util.Scanner;

public class CountElementArray {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = input.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++){
            a[i] = input.nextInt();
        } 

        System.out.println("Enter the number for count");
        int number = input.nextInt();
        int count = 0;
        for(int i = 0; i<n ; i++){
           if( a[i] == number)
                count++;
        }
        System.out.println("Count is  " + count);
    }
}
