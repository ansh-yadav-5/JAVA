import java.util.Scanner;

public class AssignGradesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many Scores");
        int n = input.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter Scores : ");
        for(int i=0; i<n; i++){
            a[i] = input.nextInt();
        }

       int max = a[0];
        for (int element : a){
            if(element > max)
                max = element;
        }
        System.out.println("Maximum number is " + max);

        int i=0;
        for (int element : a){
            if(element >= max-10)
                System.out.println("Student " + i +" score is " + element + " and grade is A");
            else if(element >= max-20)
                System.out.println("Student " + i + " score is " + element + " and grade is B");
            else if(element >= max-30)
                System.out.println("Student " + i + " score is " + element + " and grade is C");
            else if(element >= max-40)
                System.out.println("Student " + i + " score is " + element + " and grade is D");
            else 
                System.out.println("Student " + i + " score is " + element + " and grade is F");
                
            

            i++;
        }

    }
}
