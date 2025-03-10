//Check Anagrams of strings
import java.util.Arrays;
class AnagramChecker
{
  public static void main(String[] args)
	{
    String str1 = "listen";
    String str2 = "silent";
	
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
	
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if (Arrays.equals(arr1, arr2))
	{
      System.out.println(str1 + " and " + str2 + " are anagrams.");
    } else
	{
      System.out.println(str1 + " and " + str2 + " are not anagrams.");
    }
  }
}