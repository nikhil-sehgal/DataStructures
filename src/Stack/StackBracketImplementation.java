package Stack;
import java.util.Stack;

public class StackBracketImplementation {
	public static void main(String[] args) {
		String data = "()(()[])";
		
		char[] dataC = data.toCharArray();
		boolean evalParanthesisValue = evalParanthesis(dataC);
		if(evalParanthesisValue == true)
			System.out.println("Brackets are good");
		else
			System.out.println("Brackets are not good");
	}
	static boolean evalParanthesis(char[] brackets)
	{				
		if(brackets.length % 2 != 0)
		{
			return false;
		}
		
		boolean IsBracesOk;
		boolean PairCount = false;
		Stack<Character> stack = new Stack<Character>();
		for(char brace : brackets)
		{						
			if(brace == '(' || brace == '{' || brace == '['){
				stack.push(brace);	
				PairCount = false;
			}
			else if(!stack.isEmpty())
			{
				if(brace == ')' || brace == '}' || brace == ']')
				{
					char bracketPopped = stack.pop();
					if((brace == ')' && bracketPopped == '('))
					{
						IsBracesOk = true; PairCount = true;
					}
					else if((brace == '}') && (bracketPopped == '{'))
					{
						IsBracesOk = true; PairCount = true;
					}
					else if((brace == ']') && (bracketPopped == '['))
					{
						IsBracesOk = true; PairCount = true;
					}
					else 
					{
						IsBracesOk = false;
						PairCount = false;
						break;
					}
				}	
			}
		}	
		
		if(PairCount == false)
		return IsBracesOk = false;
		else
			return IsBracesOk = true;
	}
}
