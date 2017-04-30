package Array;
/*Objective is find the missing number in sequence of number
 * Example 1, 2, 4, 6, 3, 7, 8
 * In above sequence 5 is missing.
 * 
 * Missing value is 5.
 * */ 
public class ArrayFindTheMissingNumberMethod1 {
	static void findTheMissingNumber(int[] array)
	{
		int totalSum = 0, arrayLength = array.length;
		totalSum = ((arrayLength + 1) * (arrayLength + 2)) / 2;
		for(int index=0; index < arrayLength; index++)
		{
			totalSum -= array[index];
		}
		
		System.out.println("Missing value is "+ totalSum);
	}
	public static void main(String[] args)
	{
		int[] array = {1, 2, 4, 6, 3, 7, 8};
		findTheMissingNumber(array);
	}
}
