//check prime or not
import java.util.*;
class Check_Prime 
{
	public static void main(String[] args) 
	{
		int count=0,i=2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		while(num>i)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			i++;
		}
		if(count==0)
		{
			System.out.println("number is prime:");
		}
		else
			System.out.println("number is not prime");
	}
}
