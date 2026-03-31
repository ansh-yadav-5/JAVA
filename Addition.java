import java.util.Scanner;
class Addition{
	public static void main(String[] args){
	int a,b,c;
	Scanner input = new Scanner(System.in);
	System.out.println("enter two number");
	a = input.nextInt();
	b = input.nextInt();
	c = a + b;
	System.out.println("Addition is " +c);
		
}
}