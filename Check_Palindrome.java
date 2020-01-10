// to check plaindrome or not
import java.util.*;
class Check_Palindrome
{
	public static void main(String[] args) 
	{
		int rev=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int temp=num;
		while(num>0)
		{
			int d=num%10;
			num=num/10;
			rev=rev*10+d;
		}
		if(temp==rev)
		{
			System.out.println("number is palindrome");
		}
		else
			System.out.println("number is not palindrome");

	}
}
