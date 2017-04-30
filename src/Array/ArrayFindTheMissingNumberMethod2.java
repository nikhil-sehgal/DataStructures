package Array;

/*Objective is find the missing number in sequence of number
 * Example 1, 2, 4, 6, 3, 7, 8
 * In above sequence 5 is missing.
 * 
 * 5.
 * */ 
public class ArrayFindTheMissingNumberMethod2 {
	
	static void findTheMissingNumber(int[] array)
	{
		int xor1 = array[0], xor2 = 1;
		for(int index = 1; index<array.length; index++)
		{	
			xor1 = xor1 ^ array[index];
		}
		for(int index = 2; index<=array.length+1; index++)
		{		
			xor2 = xor2 ^ index;
		
		}
		System.out.println(xor1 ^ xor2);
	}
	
	public static void main(String[] args)
	{
		int[] array = {1, 2, 4, 6, 3, 7, 8};
		findTheMissingNumber(array);
	}
}
