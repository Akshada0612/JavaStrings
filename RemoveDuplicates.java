//Remove duplicates from string
class RemoveDuplicates
{
  public static void main(String[] args)
	{
    String str = "Programming";
    StringBuilder sb = new StringBuilder();

    for (char c : str.toCharArray())
	{
      if (sb.indexOf(String.valueOf(c)) == -1)
	{
        sb.append(c);
    }
   }
	System.out.println(sb.toString());
  }
}

