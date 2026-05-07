package JavaClasses;
import java.io.Serializable;


public class Student implements Serializable {
    String fname,lname,course;
    public int id;

    public Student(String fname, String lname, int id, String course) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
        this.course = course;

    }

    public void display(){
        System.out.println("Id is " + id);
        System.out.println("Name is " + fname + " " + lname);
        System.out.println("Course join  " + course);
    }

    public String toString(){
        return fname + " " + lname + " " + id + course + " ";
    }
}