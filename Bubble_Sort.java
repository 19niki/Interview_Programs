// Bubble sort program
import java.util.*;
class  Bubble_Sort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elemnts of the array");
		int a[]=new int[n];
		for(int i=0; i<a.length; i++)// to take n number of input from user
		{
			a[i]=sc.nextInt();
		}
         
		 for(int i=0; i<a.length-1; i++) // loop for the number of passes or iterations
		{
			 for(int j=0; j<a.length-i-1; j++) // loop for comparasions in th loop
			{
				if(a[j]>a[j+1]) // if the condition is true then swap else increment j to next index 
				{
                   int temp=a[j];
				   a[j]=a[j+1];
				   a[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting"); // to print the sorted array
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
