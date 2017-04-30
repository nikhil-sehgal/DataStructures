package Strings;
import java.util.Stack;
/*Objective is check if given string makes a particular word or not
 * Example
 * Word to make : hackerrank
 *  String entered:hackerrank
	hackerrank can be made from hackerrank : true

	String entered:hackerworld
	hackerrank can be made from hackerworld : false
	
	String entered:hackerran
	hackerrank can be made from hackerran : false
 * */
public class StringHackerRankInString {
	
	public static boolean HackerRankInString(String string)
	{
		char[] hackerrank = {'h','a','c','k','e','r','r','a','n','k'};
		
		if(string == null)
			return false;
		
		if(string.length() < hackerrank.length)
			return false;
		
		
			char[] newString = string.toCharArray();
			Stack<Character> stackOrignal = new Stack<Character>();
			Stack<Character> stackComparer = new Stack<Character>();
			for(char ch : hackerrank)
			 stackOrignal.push(ch);
			
			for(char ch : newString)
				stackComparer.push(ch);
			
			while(!stackComparer.isEmpty())
			{
				if(stackOrignal.peek() == stackComparer.peek())
				{
					stackOrignal.pop();
					stackComparer.pop();
				}
				else
					stackComparer.pop();				
			}
			
			if(stackOrignal.isEmpty())
				return true;
			else 
				return false;
		
	}
	public static void main(String[] args)
	{
		String string = "hackerrank";
		System.out.println("String entered:"+ string);
		System.out.println("hackerrank can be made from "+string+" : "+HackerRankInString(string));
		
		string = "hackerworld";
		System.out.println("");
		System.out.println("String entered:"+ string);
		System.out.println("hackerrank can be made from "+string+" : "+HackerRankInString(string));
		
		string = "hackerran";
		System.out.println("");
		System.out.println("String entered:"+ string);
		System.out.println("hackerrank can be made from "+string+" : "+HackerRankInString(string));
	}
}
