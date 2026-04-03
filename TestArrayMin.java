import java.util.Scanner;

public class TestArrayMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = input.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++){
            a[i] = input.nextInt();
        } 

        int min = a[0];
        for(int element : a){
            if(element < min)
                min = element;
            
        }
        System.out.println("Minimum number is " + min);
    }
}
