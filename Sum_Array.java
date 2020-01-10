import java.util.*;
class  Sum_Array
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=scan.nextInt();
		System.out.println("enter the element of the array");
		int a[]=new int[n];
		for(int i=0; i<a.length; i++)
		{
			a[i]=scan.nextInt();
		}
		int sum=0,avg=0;
		for(int i=0; i<a.length ; i++)
	{
          sum=a[i]+sum;
          avg=sum/a.length;
	}

	System.out.println("Sum of the array is:" +sum);
	System.out.println(avg);
}
}
