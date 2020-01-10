//find factorial of given number 
import java.util.*;
class Factorial 
{
	public static void main(String[] args) 
	{
		int i=1;
		int fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of the given number is: "+fact);
	}
}
