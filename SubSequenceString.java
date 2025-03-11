class SubSequenceString 
{
	public static void main(String[] args) 
	{
		String str1="abcde";
		String str2="ace";
		int i=0,j=0;
		while (i<str1.length() && j<str2.length())
		{
			if(str1.charAt(i)==str2.charAt(j))
				j++;
			i++;
		}
		if (j==str2.length())
		{
			System.out.println(str2+" is a subsequence of "+str1);
		}
		else
		{
			System.out.println(str2+" is not a subsequence of "+str1);
		}
		
	}
}
