package Stack;
import java.util.Stack;


/*Checking string palindrome using stack when string 
 * have special character in it 
 * Example
 *  ababababXbabababa : palindrome
 *  ababababXbadbababa : Not palindrome
 *  
 *  Original String : ababababXbabababa
 *  String is palindrome

 * */
public class StackStringPalindrome {
	
	
	void isPalindrome(String string)
	{
		if(string == null)
			return;
		if(string.length() < 0)
			return;
		
		
		Stack<Character> stack = new Stack<Character>();
		int start = 0, end = string.length()-1;
		boolean isStringPalindrome= false;
		
		//till special Character put values in Stack
		//once reach X start from end 
		//match end index value with stack top value
		//till the stack is not empty
		// 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 
		// a  b  a  b  a  b  a  b  X  b  a  b  a  b  a  b  a
		while(string.charAt(start)!='X')
		{			
			stack.push(string.charAt(start));
			start++;
		}
		
		start++;	
		
		while(start <= end) 
		{	
			if(string.length()-start < stack.size() || string.length()-start > stack.size())
			{
				isStringPalindrome = false;
				break;
			}
			
			if(stack.isEmpty() || string.charAt(start) != stack.peek())
			{
				isStringPalindrome = false;
				break;
			}
			
			else if(!stack.isEmpty())
			{				
				if(string.charAt(start) == stack.pop())
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
		String string = "ababababXbabababa";
		StackStringPalindrome stackStringPalindrome = new StackStringPalindrome();
		System.out.println("Original String : "+string);		
		stackStringPalindrome.isPalindrome(string);
	}
}
