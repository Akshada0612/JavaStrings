//Print all substring in given string
class Substring
{
	public static void main(String[] args) 
	{
		String str="abc";
		int len=str.length();
		System.out.println("Substring of " + str + " : ");
		for (int i=0;i<len;i++)
		{
			for (int j=i+1;j<=len;j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}
}
