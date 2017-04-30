package Array;
/*Objective is to find 2 elements in array which equals to the sum provided
 * Example 
 * In given array {9,8,7,6,5,4,3,2,1};
   we are looking for two elements with sum = 14;
   
   
   Pairs Exist at 4 and 8
 * */
public class ArrayPairWithSumXMethod1 {
	 	public static void pairWithSum(int[] array, int sumToFind)
	 	{
	 		
	 		int arrayLength = array.length;
	 		AlgorithmsCoding.QuickSort.quickSort(array, 0 , arrayLength-1);
	 		
	 		int leftIndex = 0, rightIndex = arrayLength-1;
	 		int leftIndexValue=0,rightIndexValue=arrayLength-1, totalIndexValue=0;
	 		boolean isPairExist = false;
	 		while(leftIndex < rightIndex)
	 		{	 			
	 			leftIndexValue = array[leftIndex];
	 			rightIndexValue = array[rightIndex];
	 			totalIndexValue = leftIndexValue + rightIndexValue;

	 			if(totalIndexValue == sumToFind)
	 			{
	 				isPairExist = true;
	 				break;
	 			}
	 			else if(totalIndexValue > sumToFind)
	 			{
	 				rightIndex = rightIndex - 1;
	 			}
	 			else 
	 				leftIndex = leftIndex + 1;
	 		}
	 		
	 		if(isPairExist == true)
	 			System.out.println("Pairs Exist at " +leftIndex +" and "+rightIndex);
	 		else
	 			System.out.println("No pair exist");	 		
	 	}
	 	
		public static void main(String[] args)
		{
			int[] array = {9,8,7,6,5,4,3,2,1};
			int sumToFind = 14;
			pairWithSum(array, sumToFind);
		}		
}
