package Stack;

public class Stack {
	static int top;
	static final int Max = 1000; 
	static int[] stackSize = new int[Max];
	
	Stack(){
		top = -1;
	}
	
	static void push(int x)
	{		
		if(top >= Max)
		{		
			System.out.println("OverFlow");			
		}
		else
		{
			System.out.println("Values before adding element to stack");
			System.out.println("top:"+top);
			/*System.out.println("x:"+x);			*/
			stackSize[++top] = x;			
			System.out.println("Values after adding element to stack");
			System.out.println("top:"+top);
			/*System.out.println("x:"+x);		
			System.out.println("Value added to stack.");*/
			System.out.println("");
		}
	}
	
	static int pop()
	{
		if(top<0)
		{
			System.out.println("UnderFlow");
			return 0;
		}
		else
		{
			System.out.println("Values before removing element to stack");
			System.out.println("top:"+top);			
			int x = stackSize[top];
			--top;
			System.out.println("Values after removing element to stack");
			System.out.println("top:"+top);			
			System.out.println("Value removed from stack.");
			return x;
		}
	}
	
	static void IsEmpty()
	{
		if(top < 0)	
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
	}
	
	public static void main(String args[])
	{	
		@SuppressWarnings("unused")
		Stack stack;
		stack = new Stack();
		IsEmpty();
		
					
		
		System.out.println("Adding new elements to stack");		
		System.out.println("Push(1)");
		push(1);
		System.out.println("Push(2)");
		push(2);
		System.out.println("Push(3)");
		push(3);
		System.out.println("Push(4)");
		push(4);
		System.out.println("Push(5)");
		push(5);
		
		/*System.out.println("");
		IsStackEmpty = IsEmpty();
		if(IsStackEmpty == true)
			System.out.println("There is no element in the stack");
		else
			System.out.println("There is some elements in the stack");*/
		
		System.out.println("");
		System.out.println("Fetching elements from stack");
		System.out.println("Pop()");
		System.out.println(pop());
		System.out.println("Pop()");		
		System.out.println(pop());
		System.out.println("Pop()");
		System.out.println(pop());
		System.out.println("Pop()");
		System.out.println(pop());
		
		/*System.out.println("");
		IsStackEmpty = IsEmpty();
		if(IsStackEmpty == true)
			System.out.println("There is no element in the stack");
		else
			System.out.println("There is some elements in the stack");*/
		
		
		System.out.println("");
		System.out.println("Fetching elements from stack");
		System.out.println(pop());
		
		IsEmpty();
	}	
}
