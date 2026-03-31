public class Polymorphism1 {
    public static void main(String[] args){
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new object());
    }

    public static void m(Object x){
        System.out.println(x.toString());
    }
}

class Person extends Object{
    @Override
    public String toString(){
        return "person";
    }
}

class Student extends Person{
    @Override
    public String toString(){
        return "Student";
    }
}

class GraduateStudent extends Student{
    
}
