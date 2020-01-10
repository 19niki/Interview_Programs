import java.util.*;
class Small 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		System.out.println("enter the elemnts of the array");
		int a[]=new int[n];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int small=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println("smallest number is:" +small);
	}
}
