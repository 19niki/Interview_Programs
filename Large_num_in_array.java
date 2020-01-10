import java.util.*;
public class Large_num_in_array {

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
          int large=a[0];
          for(int i=1;i<a.length;i++)
          {
        	  if(large<a[i])
        	  {
        		  large=a[i];
        	  }
        	 
          }
          System.out.println("largest number is:"+large);
	}

}
