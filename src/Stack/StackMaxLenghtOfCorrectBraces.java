package Stack;
import java.util.Stack;

/*Objective of the program is to get longest valid 
 * parentheses sequence
 * () : 2
 * ()()() : 6
 * ()())()()() : 6 ( from 6th bracket till 11th).
 * (((()))))((((()())))) :  20
*/public class StackMaxLenghtOfCorrectBraces {
		
	static int getLengthOfLongestValidSet(String prmString)
	{
	    if(prmString == null)
	    return 0;
	    
	    else if(prmString.length() < 2)
	    return 0;
	    
	    else
	    {
	    	char[] charString = prmString.toCharArray();
	        Stack<Character> stackOfOpeningBraces = new Stack<Character>();
	        int count = 0, maxLengthTillNow = 0;	        
	        for(char brace : charString)
	        {
	            if(brace == '(')    
	            stackOfOpeningBraces.push(brace);
	                        
	            else if(brace == ')')
	            {
	                if(!stackOfOpeningBraces.isEmpty())
	                {
	                    stackOfOpeningBraces.pop();
	                    count = count + 2;
	                    
	                    if(maxLengthTillNow < count)
	                    {
	                        maxLengthTillNow = count;
	                    }                       
	                }
	                else 
	                count=0;                 
	            }                
	        }
	        return maxLengthTillNow;	        
	    }
	}
	
	
	public static void main(String[] args)
	{			
		String s = "(((()))))((((()()))))";
		System.out.println("Longest valid set of brackets : "+ getLengthOfLongestValidSet(s));
	}
}
