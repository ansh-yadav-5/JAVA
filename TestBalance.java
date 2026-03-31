class Parent{
    int balance = 15000;
    Parent(int t){
        System.out.println("This is Parent...");
    }
    void display (){
        System.out.println("The Balance of parent is " + balance);
    }
}

class Son extends Parent{
    int balance = 10000;

    Son(){
        super(5);
        System.out.println("This is son...");
    }

    void display (){
        super.display();
        System.out.println("THe balance of son is " + balance);
    }

    @Override
    public String toString(){
        return "This is son class";
    }
}


public class TestBalance {
    public static void main(String[] args) {
       Son s = new Son();
       s.display();
       System.out.println(s);
}
}