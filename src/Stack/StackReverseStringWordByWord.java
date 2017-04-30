package Stack;
import java.util.Stack;
/*Reverse a string word by word
 * Example
 * Original Sentence : Hello, How are you?
 * Reversing sentence using stack : you? are How Hello, */
public class StackReverseStringWordByWord {
	public static void reverseStringWithStack(String sentence)
	{
		if(sentence == null)
			return;
		if(sentence.length() < 0)
			return;		
		else
		{
			char[] sentenceChar = sentence.toCharArray();
			Stack<String> stack = new Stack<String>();
			StringBuilder s = new StringBuilder(); 
			for(int i=0; i<sentenceChar.length;i++)
			{
				s = s.append(sentenceChar[i]);
				if(sentenceChar[i] ==' ')
				{					
					stack.push(s.toString());
					s.setLength(0);					
				}	
				if(i == sentenceChar.length - 1)
				{
					s=s.append(" ");
					stack.push(s.toString());
					s.setLength(0);
				}	
			}			
			while(!stack.isEmpty())			
				System.out.print(stack.pop());
		}		
	}
	
	public static void main(String args[])
	{
		String sentence = "Hello, How are you?";
		System.out.println("Original Sentence : "+sentence);		
		
		System.out.print("Reversing sentence using stack : ");
		reverseStringWithStack(sentence);
	}
}
