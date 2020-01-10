

public class Print_primenum
{
	public static void print_prime()
	{
		int count,num=100;
		for(int i=1; i<num; i++)
		{
			count=0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
				    count++;	
				}
			}
		
		if(count==0)
		{
			System.out.println(i);
		}
	}
	}
	public static void main(String[] args)
	{
	
	print_prime();
}
}