//Non repeating character in a string
class NonRepeatingChar 
{
	public static void main(String[] args) 
	{
		String str="aabbc";
		int [] charCount=new int[256];
		for (char c:str.toCharArray())
		{
			charCount[c]++;
		}
		for (char c:str.toCharArray())
		  {
		    
			if(charCount[c]==1)
			{
				System.out.println("First non repeating character: " + c);
				return;
			}
		  }
		System.out.println("No non-repeating character found");
	}
}
