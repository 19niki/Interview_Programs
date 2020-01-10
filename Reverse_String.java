import java.util.*;
class Reverse_String 
{
	public static void revrese(String str)
	{
		//System.out.println("original string is:"+ str);
        String str2="";
		for(int i=str.length()-1; i>=0 ; i--)
		{
			str2=str2+str.charAt(i);
		}
		System.out.println("revresed string is:" +str2);
		
		
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String str=scan.next();
		System.out.println("original string is:"+ str);
		revrese(str);
	}
}


