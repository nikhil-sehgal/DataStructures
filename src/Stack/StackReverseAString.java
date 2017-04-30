package Stack;
import java.util.Stack;

/*Objective is to reverse a string using stack
 * Example 
 * Original Sentence : Hello, How are you?
Reversing sentence using Array : ?uoy era woH ,olleH
Reversing sentence using stack : ?uoy era woH ,olleH*/

public class StackReverseAString {
	public static void reverseStringWithArray(String sentence)
	{
		if(sentence == null)
			System.out.println("Sentence is null");
		if(sentence.length() < 0)
			System.out.println("Sentence length is 0.");
		if(sentence.length() > 0 && sentence.length() < 2)
			System.out.println(sentence);
		else
		{	
			char sentenceChar[] = sentence.toCharArray();
			StringBuilder builder = new StringBuilder(); 
			for(int index=sentenceChar.length-1; index>=0;index--)
			{
				builder = builder.append(sentenceChar[index]);
			}
			System.out.println(builder.toString());
			
			/*We can use this is process also when
			 *  we just want to print reversed string 
			and don't want to pass it to another method.			
			for(int index=sentenceChar.length-1; index>=0;index--)
			{
				System.out.print(sentenceChar[index]);
			}*/
		}	
	}
		
	public static void reverseStringWithStack(String sentence)
	{
		if(sentence == null)
			System.out.println("Sentence is null");
		if(sentence.length() < 0)
			System.out.println("Sentence length is 0.");
		if(sentence.length() > 0 && sentence.length() < 2)
			System.out.println(sentence);
		else			
		{		
			Stack<Character> stack = new Stack<Character>();
			StringBuilder builder = new StringBuilder(); 
			for(int i=0; i<sentence.length();i++)
				stack.push(sentence.charAt(i));
			
			while(!stack.isEmpty())
				builder = builder.append(stack.pop());

			System.out.print(builder.toString());
		}		
	}
	
	public static void main(String args[])
	{
		String sentence = "Hello, How are you?";
		System.out.println("Original Sentence : "+sentence);
		
		System.out.print("Reversing sentence using Array : ");
		reverseStringWithArray(sentence);
		
		
		System.out.print("Reversing sentence using stack : ");
		reverseStringWithStack(sentence);
	}
}
