package Strings;

public class StringCeaserCipher {
	/*Objective is to Encode a string by moving k bits
	 * Example:
	 * 
	 * Original String : Secret-Message	 * 					  
	 * 					 Tfdsdu-Ndttbhf
	 * Encoded String :  Ugetgv-Oguucig
	 * */
	public static void ceaserCipher(String string, int movingBit)
	{
		//A = 65, Z = 90 , a = 97, z = 122
		if(!string.isEmpty())
		{
		StringBuilder builder = new StringBuilder();		
		int charAsciiVal=0;
		for(int indexer=0; indexer < string.length(); indexer++)
		{
			charAsciiVal = (int)(string.charAt(indexer));
			if(charAsciiVal >= 65 && charAsciiVal <= 90)
			{
				charAsciiVal += (movingBit%26);
				if(charAsciiVal > 90)
				{
					charAsciiVal = (charAsciiVal - 90) + 64;
				}
			}
			
			else if(charAsciiVal >= 97 && charAsciiVal <= 122)
			{
				charAsciiVal += (movingBit%26);
				if(charAsciiVal > 122)
				{
					charAsciiVal = (charAsciiVal - 122) + 96;
				}
			}
			
			builder.append(Character.toString((char)charAsciiVal));
			charAsciiVal=0;
		}	
		System.out.println(builder.toString());
		}
	}
	public static void main(String[] args)
	{
		String string = "Secret-Message";
		int bitsToMove = 2;
		System.out.println("Original String : "+ string);
		System.out.print("Encoded String : ");
		ceaserCipher(string,bitsToMove);
	}
}
