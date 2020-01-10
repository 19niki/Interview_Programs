//palindrome(reverse)
import java.util.*;
class  Palindrome
{
	public static void main(String[] args) 
	{
	    int rev=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to be reversed");
		int num=scan.nextInt();
		while(num>0)
		{
		//int num=scan.nextInt();
		int d=num%10;
		  num=num/10;
         rev=rev*10+d;
	}
	System.out.println("the reversed number is \n"+ rev);	
	}
}
