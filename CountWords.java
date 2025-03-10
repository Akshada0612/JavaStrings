//Count no.of.words in a String
class CountWords 
{
	public static void main(String[] args) 
	{
		String str="Hello Java Programming";
		int len=str.length();
		int count=0;
		
		for (int i=0;i<len;i++)
		{
			if (str.charAt(i)==' ')
			{
				count++;
			}
		}
		count++;
		System.out.println("Total no.of words are:" + count);
	}
}
