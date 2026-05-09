import JavaClasses.Student;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;


public class readFile {
    public static void main(String[] args) throws Exception {
        ArrayList <Student> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
    ){
        list = (ArrayList <Student>) input.readObject();
    }
    for(Student s: list){
        System.out.println(s);
    }
    }
}
