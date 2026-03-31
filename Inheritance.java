class Point2D{
    int x,y;

    void display(){
        System.out.println("x= " + x + "y= " + y);
    }
}

class Point3D extends Point2D{
    int z;

    void display(){
        System.out.println("x= " + x + "y= " + y + "z= " + z);
    }
} 



public class Inheritance {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point3D p2 = new Point3D();
        System.out.println("Point 2D p1 points is  ");
        p1.x = 10;
        p1.y = 15;
        p1.display();
        p2.x = 5;
        p2.y = 6;
        p2.z = 15;
        System.out.println("Point 3D p2 points is  ");
        p2.display();        
    }
}