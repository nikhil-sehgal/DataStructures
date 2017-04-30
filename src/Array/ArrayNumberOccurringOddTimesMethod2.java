package Array;
/*Objective is to find element occurring odd times in array
 * Example : In array {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2, 2}
 * 2 is occurring 5 times.
	5 is occurring 3 times.
 * */
import java.util.HashMap;
import java.util.Set;
public class ArrayNumberOccurringOddTimesMethod2 {

	static void getOddOccurrence(int[] array, int lenghtOfArray)
	{
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for(int index=0; index<lenghtOfArray; index++)
		{	
			if(hash.containsKey(array[index]))	
				hash.put(array[index], hash.get(array[index])+1);
			
			else			
				hash.put(array[index], 1);
		}
		
		Set<Integer> key = hash.keySet();
		for(int val:key)
		{
			if(hash.get(val)%2!=0 && hash.get(val)!=1)
				System.out.println(val+" is occurring "+hash.get(val)+" times.");
		}
		
	}
	public static void main(String[] args)
	{
		int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2,2};
        int n = ar.length;
        getOddOccurrence(ar, n);
	}
}
