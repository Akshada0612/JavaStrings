//check prefix and suffix
class PrefixSuffix 
{
	public static void main(String[] args) 
	{
		String str="abacaba";
		String longestPrefixSuffix=" ";
		for (int i=1;i<=str.length()/2;i++)
		{
			String prefix=str.substring(0,i);
			String suffix=str.substring(str.length()-i);
			if (prefix.equals(suffix) && prefix.length() > longestPrefixSuffix.length())
			{
				longestPrefixSuffix=prefix;
			}
		}
		
		System.out.println("Longest prefix that is also a suffix:" + longestPrefixSuffix);
	}
}
