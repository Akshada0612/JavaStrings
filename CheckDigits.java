//Check only digits in String
class CheckDigits 
{
	public static void main(String[] args) 
	{
		String str="12345";
		boolean isDigit=true;
		for (char c:str.toCharArray())
		{
			if (!Character.isDigit(c))
			{
				isDigit=false;
				break;
			}
		}
		if (isDigit)
		{
			System.out.println("The String contains only digits");
		}
		else
		{
		System.out.println("The string does not contain digits");
		}
	}
}
