//check even or odd
import java.util.*;
class  Even_Odd
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	if(num%2==0)
		{
		System.out.println(num + " number is even");
		}
		else
		System.out.println(num + " number is odd");
	}
	
}
