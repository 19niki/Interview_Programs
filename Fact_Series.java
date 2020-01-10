// To find series of factorial
import java.util.*;
class Fact_Series
{
	public static void main(String[] args) 
	{
		int m,n;
        int fact=1;
		int temp=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value for m");
		m=scan.nextInt();
        System.out.println("enter the value for n");
		n=scan.nextInt();
		for(int i=m; i<=n; i++)
		{
			while(temp<=m)
			{
				fact=fact*temp;
				temp++;
				
			}
			
			System.out.println("factorial of " + m +" is " +fact);
			m++;
		}
	}
}
