//Find longest palindrome in a string
class LongestPalindrome  
{
	public static void main(String[] args) 
	{
		String str="ababacdac";
		String longPalindrome=" ";
		for (int i=0;i<str.length();i++)
		{
			for (int j=i+1;j<=str.length();j++)
			{
				String substr=str.substring(i,j);
				int start=0;
				int end=substr.length()-1;
				boolean isPalindrome=true;
				while (start<end)
				{
					if (substr.charAt(start)!=substr.charAt(end))
					{
						isPalindrome=false;
						break;
					}
					start++;
					end--;
				}
				if(isPalindrome && substr.length() > longPalindrome.length())
				{
					longPalindrome=substr;
				}
			}
		}
		System.out.println("Longest Palindrome: " + longPalindrome);
	}
}
