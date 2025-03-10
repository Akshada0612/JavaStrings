//Palindrome a string
import java.util.Scanner;
class PallindromeString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		String org_str=str;
		String rev=" ";
		int len=str.length();
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String is:" + rev);
		if(rev==org_str)
		{
			System.out.println("It is palindrome String");
		}else
		{
			System.out.println("It is not palindrome string");
		}
	}
}
