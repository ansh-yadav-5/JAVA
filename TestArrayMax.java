import java.util.Scanner;


public class TestArrayMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = input.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements ");
        for(int i =0; i<n ; i++){
            a[i] = input.nextInt();
        }

        int max = a[0];
        for (int element : a){
            if(element > max)
                max = element;
        }
        System.out.println("Maximum number is " + max);

    }
}
