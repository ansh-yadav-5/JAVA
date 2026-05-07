import JavaClasses.Student;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Write {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("object.dat");
        ArrayList <Student> list = new ArrayList<>();

        if (file.exists()) {
            try(ObjectInputStream readData = new ObjectInputStream(new FileInputStream("object.dat"));
        ){
            list = (ArrayList <Student>) readData.readObject();
        } catch(Exception e){}
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Students ");
        int n = input.nextInt();
        String fname,lname,course;
        int id;

        Student[] s = new Student[100];
        for(int i=0; i<n; i++){
            System.out.println("Enter first name ");
            fname = input.next();
            System.out.println("Enter last name ");
            lname = input.next();
            System.out.println("Enter id ");
            id = input.nextInt();
            System.out.println("Enter course ");
            course = input.next();
            s[i] = new Student(fname,lname,id,course);
            list.add(s[i]);
        }

        try(ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.dat")));){
            output.writeObject(list);
            System.out.println("Write data successfully ");
        }
    }
}
