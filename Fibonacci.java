// to print fibbonacci
import java.util.*;
class Fibonacci
{
	public static void main(String[] args)
	{
	int c3;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the starting number");
	int n=scan.nextInt();
    System.out.println("enter the ending number");
	int m=scan.nextInt();
	System.out.println("Fibonacci series of the given range of number is:");
	System.out.println(n);
	int temp=n;   //or we can write temp=n+1; and we can print temp
	System.out.println(++temp);
    for(int i=n; i<m; i++)
	{
	  c3=n+temp;
      n=temp;
	  temp=c3;
	  System.out.println(c3);
	}
	n++;
}
}
