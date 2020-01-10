// check the number is armstrong or not
import java.util.*;
class Armstrong
{
	public static void main(String[] args) 
	{    
		int sum=0,temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		temp=num;
		while(num>0)
		{
		int d=num%10;
		int i=1,fact=1;
		while(i<=d)
		{
			fact=fact*i;
			i++;
		}
		sum=sum+fact;
		num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("number is armstrong");
		}
		else
			System.out.println("number is not armstrong");
	}
}
