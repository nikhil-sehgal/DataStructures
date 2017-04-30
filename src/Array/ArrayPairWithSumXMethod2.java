package Array;

/*Objective is to find 2 elements in array which equals to the sum provided
 * Example 
 * In given array {9,8,7,6,5,4,3,2,1};
   we are looking for two elements with sum = 14;
   
   
    Pair with given sum 14 is (6, 8)
	Pair with given sum 14 is (5, 9)

 * */

public class ArrayPairWithSumXMethod2 {
	private static final int MAX = 100000;
	public static void pairWithSum(int[] array, int sumToFind)
	{
		boolean[] binmap = new boolean[MAX];
		 
        for (int i=0; i<array.length; ++i)
        {
            int temp = sumToFind-array[i];
 
            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                		sumToFind + " is (" + array[i] +
                                    ", "+temp+")");
            }
            binmap[array[i]] = true;
        }
	}
	public static void main(String[] args)
	{
		int[] array = {9,8,7,6,5,4,3,2,1};
		int sumToFind = 14;
		pairWithSum(array, sumToFind);
	}
}
