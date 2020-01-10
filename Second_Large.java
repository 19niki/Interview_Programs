import java.util.*;
class  Second_Large
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
		int large=a[0];
		int second=a[1];
		for(int i=1; i<a.length; i++)
		{
		if(large<a[i])
		{
			second=large;
			large=a[i];
		}
		else if(a[i]>second)
			{
			     second=a[i];
			}
		}
		System.out.println("Second largest element is:" +second);
		System.out.println("largest element is:" +large);

}
}