import java.util.*;
public class Selection_Sort {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int num=sc.nextInt();
		System.out.println("enter the elements of the array");
		int a[]=new int[num];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
          for(int i=0;i<a.length-1;i++)
          {
        	 int pos=i;
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[pos]>a[j])
        				{
        			       pos=j;
        				}
        		if(a[pos]!=i)
        		{
        			int temp=a[i];
        			a[i]=a[pos];
        			a[pos]=temp;
        		}
        		}
        	
            	}
        	 System.out.println("Array after sorting"); 
           for(int i=0; i<a.length;i++)
  		{
        	  System.out.println(a[i]);
  		}
          
	}

}
