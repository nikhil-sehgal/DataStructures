package Array;
/*Objective is to find Largest Sum Contiguous Subarray
 * {-2, -3, 4, -1, -2, 1, 5, -3}
 * 4 + (-1) + (-2) + 1 + 5 = 7 is the longest sub array;
 * */
public class ArrayLargestSumContiguousSubarray {
	
	static void LargestSumContiguousSubarray(int[] array)
	{		
		int maxTillNow = 0, maxSoFar = 0,start =0, end = 0, s=0;;
		for(int i=0;i<array.length;i++)
		{			
			maxTillNow = maxTillNow + array[i];
			
			if(maxTillNow<0){
				maxTillNow = 0;
				s=i+1;
				}
			
			if(maxSoFar < maxTillNow){
				maxSoFar = maxTillNow;
				start = s;
				end = i;
			}
		}
		System.out.println(maxSoFar+" is max value from "+start+" index to "+end+" index");
	}
	
	public static void main(String[] args)
	{
		int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
		LargestSumContiguousSubarray(array);
	}
}
