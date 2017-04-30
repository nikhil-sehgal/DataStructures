package Strings;
import java.util.Stack;

/*Objective is to reduce a string with condition like
 * 1. we can delete any pair of adjacent letters with same value. 
 * For example, string "aabcc" would become either "aab" or "bcc" 
 * after  operation.
 * 2. If the final string is empty, print Empty String.
 * 
 * Original String : aaabccddd
	Reduced string : abd
	Reduced string : abd
	
	Original String: bccb
	Reduced string : Empty String
	Reduced string : Empty String
	
	There are 2 methods to solve.
 * */

public class StringSuperReduced {

	//method 1
	public static void reducedStringUsingStack(String string)
	{		
		Stack<Character> stack = new Stack<>();
        int h = 0;  //height of stack
        
        for (int i=0; i<string.length(); i++) {
            if (!stack.isEmpty() && stack.peek().equals(string.charAt(i))) {
                stack.pop();    //throw away
                h--;
            } else {
                stack.push(string.charAt(i));
                h++;
            }
        }
        
        if (h == 0) {
            System.out.println("Empty String");
        }   
        else
        {
        	char[] c = new char[h];
        	for (int i=h-1; i>=0; i--) {
        		c[i] = stack.pop();
            }        	
        	System.out.println(new String(c));
        }
    }
	
	//method 2
	public static void reducedString(String string)
	{
		StringBuilder s = new StringBuilder(string);
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                s.delete(i-1, i+1);
                i = 0;
            }
        }
        if(s.length() == 0) System.out.println("Empty String");
        else System.out.println(s);
    }
	
	public static void main(String[] args)
	{		
		String string = "aaabccddd";
		System.out.println("Original String : " + string);
		System.out.print("Reduced string : ");
		reducedStringUsingStack(string);
		System.out.print("Reduced string : ");
		reducedString(string);
		
		
		string = "bccb";
		System.out.println();
		System.out.println("Original String: " + string);
		System.out.print("Reduced string : ");
		reducedStringUsingStack(string);
		System.out.print("Reduced string : ");
		reducedString(string);
	}
}
