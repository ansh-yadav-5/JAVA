class Rectangle{
	int length,width ;
	Rectangle ( int x , int y){
		length = x;
		width = y;
}
	int RectangleArea(){
		return length*width;
}
}

	class TestRectangle{
	public static void main ( String[]args){
		Rectangle r1 = new Rectangle (15,10);
		int area = r1.RectangleArea();
		System.out.println(" Area of r1 is " + area);
}
}  