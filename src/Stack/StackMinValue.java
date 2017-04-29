package Stack;
import java.util.Stack;

public class StackMinValue {
	
	Stack<Integer> mainStack = new Stack<Integer>();
	Stack<Integer> auxStack = new Stack<Integer>();
	
	void insertValue(int data)
	{
		if(mainStack.isEmpty() && auxStack.isEmpty())
		{
			mainStack.push(data);
			auxStack.push(data);
		}
		
		else
		{
			mainStack.push(data);
			int  auxStackValue = auxStack.peek();			
			if(data > auxStackValue)				
				auxStack.push(auxStackValue);
			else			
				auxStack.push(data);
		}
	}
	
	int minValue()
	{
		if(auxStack.isEmpty())		
			return -1;  
		else
			return auxStack.peek();
	}
	
	void deleteValue()
	{
		if(mainStack.isEmpty() && auxStack.isEmpty())			
			return;
		
		//remove main stack value and aux stack value
		else
		{
			mainStack.pop();
			auxStack.pop();
		}
	}
	
	int sizeOfStack()
	{
		return mainStack.size();
	}
	public static void main(String[] args)
	{
			StackMinValue stackMinValue = new StackMinValue();
			stackMinValue.insertValue(2);
			stackMinValue.insertValue(6);
			stackMinValue.insertValue(4);
			stackMinValue.insertValue(1);
			stackMinValue.insertValue(5);
			
			System.out.println("Now Min value of Stack is "+ stackMinValue.minValue());
			stackMinValue.deleteValue();
			System.out.println("Deleted stack value, Now Total elements left in stack are"+stackMinValue.sizeOfStack());
			stackMinValue.deleteValue();
			System.out.println("Deleted stack value, Now Total elements left in stack are"+stackMinValue.sizeOfStack());
			
			System.out.println("Now Min value of Stack is "+ stackMinValue.minValue());
			
			stackMinValue.deleteValue();
			System.out.println("Deleted stack value, Now Total elements left in stack are"+stackMinValue.sizeOfStack());
			stackMinValue.deleteValue();
			System.out.println("Deleted stack value, Now Total elements left in stack are"+stackMinValue.sizeOfStack());
			stackMinValue.deleteValue();
			System.out.println("Deleted stack value, Now Total elements left in stack are"+stackMinValue.sizeOfStack());			
			
			System.out.println("Now Min value of Stack is "+ stackMinValue.minValue());
			
			System.out.println("Inserting new stack value");
			stackMinValue.insertValue(6);
			System.out.println("Now Min value of Stack is "+ stackMinValue.minValue());
			
	}
}
