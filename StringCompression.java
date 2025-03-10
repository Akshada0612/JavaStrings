//String Compression
class StringCompression  
{
	public static void main(String[] args) 
	{
		String str="aabbbccc";
		StringBuilder sb=new StringBuilder();
		int count=1;
		System.out.println("original string " + str);
		for (int i=1;i<=str.length();i++)
		{
			if(i==str.length()||str.charAt(i)!=str.charAt(i-1))
			{
				sb.append(str.charAt(i-1));
				sb.append(count);
				count=1;
			}else
			{
				count++;
			}
		}
		System.out.println("Compressed String:" + sb.toString());
	}
}
