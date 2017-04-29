package Stack;
import java.util.Stack;
public class StackReverseAString {
	public static void reverseStringWithArray(String sentence)
	{
		if(!(sentence.isEmpty()))
		{			
			char sentenceChar[] = sentence.toCharArray();			
			for(int index=sentenceChar.length-1; index>=0;index--)
			{
				System.out.print(sentenceChar[index]);
			}
		}
		else
			System.out.println("given sentence is empty");		
	}
	
	public static void reverseStringWithStack(String sentence)
	{
		if(!(sentence.isEmpty()))
		{
			//char sentenceChar[] = sentence.toCharArray();
			Stack<String> stack = new Stack<String>();
			StringBuilder s = new StringBuilder(); 
			for(int i=0; i<sentence.length();i++)
			{
				s = s.append(sentence.charAt(i));
				if(sentence.charAt(i) ==' ' || i == sentence.length()-1)
				{
					stack.push(s.toString());
					s.setLength(0);
				}				
			}
			
			while(!stack.isEmpty())
			{
				System.out.print(stack.pop());
			}
			
		}
		else
			System.out.println("given sentence is empty");		
	}
	
	public static void main(String args[])
	{
		String sentence = "Hello, How are you?";
		System.out.println(sentence);
		System.out.println("");
		reverseStringWithArray(sentence);
		System.out.println("");
		reverseStringWithStack(sentence);
	}
}
