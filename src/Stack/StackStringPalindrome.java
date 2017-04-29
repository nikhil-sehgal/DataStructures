package Stack;
import java.util.Stack;
public class StackStringPalindrome {
	Stack<Character> stack = new Stack<Character>();
	
	void isPalindrome(String line)
	{
		//till special Character put values in Stack
		// once reach X start from end 
		//match end index value with stack top value
		//till the stack is not empty
		// 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 
		// a  b  a  b  a  b  a  b  X  b  a  b  a  b  a  b  a 
		int start = 0, end = line.length()-1;
		boolean isStringPalindrome= false;
		
		while(line.charAt(start)!='X')
		{			
			stack.push(line.charAt(start));
			start++;
		}
		start++;
		
		
		while(start <= end) 
		{	
			if(line.length()-start < stack.size() || line.length()-start > stack.size())
			{
				isStringPalindrome = false;
				break;
			}
			
			if(stack.isEmpty() || line.charAt(start) != stack.peek())
			{
				isStringPalindrome = false;
				break;
			}
			
			else if(!stack.isEmpty())
			{
				System.out.println(line.charAt(start)+" : "+ stack.peek());
				if(line.charAt(start) == stack.pop())
				{
					isStringPalindrome = true;					
				}				
			}
			start++;
		}		
		
		
		if(isStringPalindrome)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
	public static void main(String[] args)
	{
		StackStringPalindrome stackStringPalindrome = new StackStringPalindrome();
		stackStringPalindrome.isPalindrome("madamXmadam");
	}
}
