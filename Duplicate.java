// to find duplicate elemrnts in an array
import java.util.*;
class Duplicate 
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
		int count=0;
		for (int i=0;i<a.length ;i++ )
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
                    count++;
					System.out.println("duplicate elemets are:" +a[j]);
				}
				
			}

		}
		if(count==0)
		{
			System.out.println("no dupicate elements found");
		}
        
			
}

}