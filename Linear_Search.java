//Linear search
class  Linear_Search
{
	public static void main(String[] args) 
	{
		int a[]={12,78,89,65,45};
		int pos=0;
		int count=0;
		int key=78;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==key)
			{
				pos=i+1;
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("key not found");
		}
		else
			System.out.println("key found at " + pos + "position");
	}
}
