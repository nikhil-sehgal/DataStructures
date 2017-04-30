package Strings;

public class StringCamelCase {
	
	public static int camelCase(String string)
	{
		if(string == null)
			return 0;
		if(string.length() < 0)
			return 0;
		else
		{
			int count = 1;
			for(int indexer = 1; indexer<string.length(); indexer++)
			{
				int charAscii = (int)(string.charAt(indexer));
				// A = 65, Z = 90 , a = 97, z = 122
				if(charAscii > 64 && charAscii < 91)
				{
					count++;
				}
			}		
		return count;
		}
	}
	public static void main(String[] args)
	{	
		String string = "letsFindTheNumberOfWords.";
		System.out.println("Numbers of words : "+camelCase(string));	
	}
}
