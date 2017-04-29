package Stack;
import java.util.Stack;

/*Objective is to check if the input string of 
 * parentheses are in proper sequence or not
 * Example : 
 * ( : Not in sequence.
 * ()) : Not in sequence.
 * (({(}))) : Not in sequence.
 * (){}[] : In sequence.
 * ({({[]})(){}}) : In sequence.
 * */

public class StackBracketImplementation {
	public static void main(String[] args) {
		String data = "({({[]})(){}})";
		boolean evalParanthesisVal = evalParanthesis(data);
		
		if(evalParanthesisVal == true)
			System.out.println("Brackets are in sequence.");
		else
			System.out.println("Brackets are not in sequence");
	}
	static boolean evalParanthesis(String string)
	{				
		if(string == null)
			return false;
		
		if(string.length() % 2 != 0)
			return false;
				
		char[] brackets = string.toCharArray();
		boolean IsBracesInSeq = false;		
		Stack<Character> stack = new Stack<Character>();
		for(char bracket : brackets)
		{						
			if(bracket == '(' || bracket == '{' || bracket == '['){
				stack.push(bracket);
			}
			
			else if(bracket == ')' || bracket == '}' || bracket == ']')
				{
					if(!stack.isEmpty())
					{
						char bracketPopped = stack.pop();				
						if((bracket == ')' && bracketPopped == '('))
							IsBracesInSeq = true;
						
						else if((bracket == '}') && (bracketPopped == '{'))
							IsBracesInSeq = true;
						
						else if((bracket == ']') && (bracketPopped == '['))
							IsBracesInSeq = true;
						
						else 
						{
							IsBracesInSeq = false;						
							break;
						}
					}
					else
					{
						System.out.println("opening brackets stack empty");
						IsBracesInSeq = false;						
						break;
					}
				}				
		}	
		
		if(IsBracesInSeq == false)
			return false;
		else
			return true;
	}
}
