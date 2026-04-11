public class CircleWithException {
    
    
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithException(){
        this(1.0);
    }

    public CircleWithException (double newRadius){
        SetRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius(){
        return radius;
    }

    public void SetRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0) {
            radius = newRadius;


        }else
            throw new IllegalArgumentException("Radius cannot be negative");
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double findArea(){
        return radius*radius*Math.PI;
    }
}
