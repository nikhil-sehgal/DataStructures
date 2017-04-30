package Strings;

import java.util.HashMap;

/*Objective is to find if a sentence is pangram or not
 * Sentence is called pangram if contains all the letters of the 
 * English alphabet atleast once.
 * Example : "The quick brown fox jumps over the lazy dog" is a pangram. *
 * 
 *  "The quick brown fox jumps over the lazy dog" is pangram : true
	"The brown fox jumps over the lazy dog" is pangram : false

 * */
public class StringPangrams {
		public static boolean evalIsPangram(String string)
		{
			boolean isPanagram = false;
			char[] strCh = string.toLowerCase().toCharArray();
			HashMap<Character, Integer> hash = new HashMap<Character, Integer>(); 
			
			for(char ch : strCh)
			{
				if(hash.containsKey(ch))
					hash.put(ch, hash.get(ch)+1);
				
				else
					hash.put(ch,1);
			}			
			
			for(char i='a'; i<'z'+1; i++){				
	            if(hash.containsKey(i)){
	                isPanagram = true;
	            } else{	            	
	                isPanagram = false;
	                break;
	            }
	        }
			
			if(isPanagram == true)
				return true;
				else
					return false;
			}
		public static void main(String[] args)
		{
			String sentence = "The quick brown fox jumps over the lazy dog";
			System.out.println("\""+sentence+ "\" is pangram : "+ evalIsPangram(sentence));
			
			sentence = "The brown fox jumps over the lazy dog";
			System.out.println();
			System.out.println("\""+sentence+ "\" is pangram : "+ evalIsPangram(sentence));
		}
}
