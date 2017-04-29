package Stack;
import java.util.Stack;

public class StackImplementation {
	public static void main(String[] args){
		
		Stack<Integer> stck =  new Stack<Integer>();
		stck.push(10);
		stck.push(9);
		stck.push(8);
		stck.push(7);
		stck.push(6);
		stck.push(5);
		stck.push(4);
		stck.push(3);
		stck.push(2);
		stck.push(1);
		PrintStack(stck);
		System.out.println("Maximum number is : "+MaxNumber(stck));
		PrintStack(stck);
	}
	private static int MaxNumber(Stack<Integer> S)
	{
		int max=0;
		while(!S.isEmpty())
		{
			if(S.peek()>max)
			{
				max=S.peek();			
			}
			S.pop();
		}
		return max;
	}
	
	private static void PrintStack(Stack<Integer> S)
	{
		if(S.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.printf("%s - I Am Top \n", S);
	}
}
