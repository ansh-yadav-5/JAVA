 class CirlceWithStaticMembers{
	double radius;
	Static int numberOfObjects = 0

	CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects++;

}	
	CircleWithStaticMembors(double newRadius){
		radius = newRadius;
		numberOfObjets++;
}
	static int getNumberOfObjects(){
		return numberOFObjects;
	}
	double getArea(){
		return radius*radius*Math.PI;
	}
}
	public class TEstCircleWithStaticMembers{
		public static void man(String[]args){
	System.out.println(" Before creating objects");
	System.out.println(" the number of circle objects is" + CircleWithStaticMembers.numbersOfObjects);

	CircleWithStaticMembers C1 = new CircleWithStaticMembers();

	System.out.println(" \n after creating c1");
	System.out.println("c1: radius (" + C1.radius (" + C1.radius + ") and number of circle objects (" + C1.numberOfObjects +")");

	CircleWithStaticMembers C2 = new CircleWithStaticMembers(5);
	C1.radius = 9;
	
	Sytstem.out.println(" \n After creating c2 and modify c1");
	System.out.println( " C1:radius (" C1.radius + " ) and number of circle objects (" + C1.numberOfObjects +")");
	System.out.println( " C2:radius + "( " + C2.radius + ") and number of circle objects ( " C2.numberOfObjects + ") " );
}
} 
				