//Check vowels and consonents in the string
class CheckVowelsConsonents 
{
	public static void main(String[] args) 
	{
		String str="Akshada";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++)
		{
		char c = str.charAt(i);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
        System.out.println("Vowel: " + c);
         } 
        else if (Character.isLetter(c))
		{
        System.out.println("Consonant: " + c);
        } 
	  else 
		{
        System.out.println("Special character/Number: " + c);
      }
    }
  }
}
