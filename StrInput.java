import java.util.Scanner;
	public class StrInput{
	public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	System.out.println("enter any word");
	String Str1 = input.next();
	System.out.println(Str1);
	input.nextline();
	System.out.print("enter any word:");
	String str2 = input.nextline();
	System.out.println(Str2);
	}
}