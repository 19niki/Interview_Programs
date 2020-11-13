//Binary search 
class Binary_Search
{
	public static void main(String[] args) 
	{
		int a[]={25,45,78,89,65};
		int first=0;
		int last=a.length-1;
		int key=78;
		int mid=(first+last)/2;
		while(first<=last)
		{
          if(a[mid]==key)
			{
			  System.out.println("key element found at " +mid);
			  break;
			}
			else if(a[mid]<key)
			{
				first=mid+1;
			}
			else
				last=mid-1;
			mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("element not found");
		}
	}
}

