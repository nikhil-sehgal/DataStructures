package Array;
/*Objective is to find count of elements occurring odd times in array
 * Example : In array {2, 3, 5, 4, 5, 2, 4, 3,  5, 2, 4, 4, 2}
 * 5 is occurring odd times.
 * */
public class ArrayNumberOccurringOddTimesMethod1 {
	
	static void getOddOccurrence(int ar[], int ar_size) 
    {
        int i;
        int res = 0;
        for (i = 0; i < ar_size; i++) 
        {
            res = res ^ ar[i];
        }
        System.out.println("Number occurring odd time is :"+res);
    }
	
	public static void main(String[] args)
	{
		int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3,  5, 2, 4, 4, 2};
        int n = ar.length;
        getOddOccurrence(ar, n);
	}
}
