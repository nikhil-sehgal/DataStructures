package Array;
/*Objective of the program is to rotate the array by k bits
Example 
Array before rotation is : 1 2 3 4 5 6 7 
Array after rotation is : 3 4 5 6 7 1 2 

*explanation
After shift 1 : 2 3 4 5 6 7 1
After shift 2 : 3 4 5 6 7 1 2
*/
public class ArrayRotation {

		static void rotation(int[] array, int shiftToDo)
		{			
			
			int temp;
			int arraylastIndex = array.length - 1;
			while(shiftToDo > 0)
			{
				temp = array[0];
				for(int i=0; i<array.length-1; i++)
				{					
					array[i] = array[i+1];
				}

				array[arraylastIndex] = temp;
				shiftToDo--;
			}			
		}
		public static void main(String[] args)
		{
			int[] array = {1,2,3,4,5,6,7};
			int roatationToPerferm = 2;
			
			System.out.print("Array before rotation is : ");
			for(int numbers : array)
				System.out.print(numbers + " ");
			
			rotation(array, roatationToPerferm);
						
			System.out.println();
			System.out.print("Array after rotation is : ");
			for(int numbers : array)
				System.out.print(numbers + " ");
		}
}
