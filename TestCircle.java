class Circle{
	double radius = 1;

	void getRadius(double r){
		radius = r;

	}

	double getArea(){
		return radius * radius * Math.PI;
	}

	Double getParameter(){
		return 2 * radius * Math.PI;
	}

}

public class TestCircle{
	public static void main(String[] args){
		Circle c1 = new Circle();
		c1.getRadius(25);
		System.out.println("The area of the circle of radius " + c1.radius + " is " + c1.getArea());

		Circle c2 = new Circle();
		c2.getRadius(125);
		System.out.println("The area of the circle of radius " + c2.radius + " is " + c2.getArea());
}

}