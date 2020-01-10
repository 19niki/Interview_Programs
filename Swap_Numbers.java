//Swapping of two numbers
import java.util.*;
class Swap_Numbers
{
	public static void main(String[] args) 
	{
    Scanner scan=new Scanner(System.in);
	System.out.println("enter the first  number");
	int a=scan.nextInt();
	System.out.println("enter the second number");
	int b=scan.nextInt();
	System.out.println("Numbers before swapping: " + a + " and: " + b );
	int temp=a;
	a=b;
	b=temp;
	System.out.println("Numbers after swapping: " + a + " and: "+ b);
	}
}
