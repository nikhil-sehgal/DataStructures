package Stack;
import java.util.Stack;
public class StackPolishNotation {
	public static void main(String[] args) {
		String[] tokens = new String[] { "2", "1", "+", "3", "*" };
		System.out.println(evalNotation(tokens));
	}
	
	static int evalNotation(String[] tokens)
	{
		Stack<String> stack = new Stack<String>();
		String operators = "+-*/";
		
		for(String data : tokens)
		{
			if(!operators.contains(data))
			{
				stack.push(data);				
			}
			else
			{
				int value1 = Integer.valueOf(stack.pop());
				int value2 = Integer.valueOf(stack.pop());
				switch(data)
				{
				case "+": stack.push(String.valueOf((value1 + value2)));
				break;
				case "-": stack.push(String.valueOf((value1 - value2)));
				break;
				case "*": stack.push(String.valueOf((value1 * value2)));
				break;
				case "/": stack.push(String.valueOf((value1 / value2)));
				break;
				}
			}
		}
		return Integer.valueOf(stack.pop());
	}
}
