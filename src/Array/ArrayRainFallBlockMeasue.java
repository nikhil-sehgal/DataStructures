package Array;

public class ArrayRainFallBlockMeasue {

	public static int evalRainFall(int[] buildingGroup)
	{
		//Will move from first building if other building is bigger
		int highestbuildingIndex = 0;
		//check the amount of water clog happend
		int waterClog = 0, heightDifference = 0, maxWaterClog = 0 ;
		for(int i=1; i<buildingGroup.length;i++)
		{ 	
			if(buildingGroup[highestbuildingIndex] > buildingGroup[i])
			{
				System.out.println("largest building is : "+highestbuildingIndex);				
				heightDifference = buildingGroup[highestbuildingIndex] - buildingGroup[i];
				System.out.println("Water clog between "+highestbuildingIndex+
						" and "+ i +" is "+ heightDifference);
				
				waterClog += heightDifference;
				System.out.println("Total Water clog between "+highestbuildingIndex+
						" and "+ i +" is "+ waterClog);
			}
			else if(buildingGroup[highestbuildingIndex] <= buildingGroup[i])
			{
				System.out.println();
				System.out.println("Now largest building is : "+i);
				highestbuildingIndex = i;				
				if(maxWaterClog < waterClog)
				maxWaterClog = waterClog;
				
				waterClog = 0; 
				System.out.println("waterClog Happend till now : "+waterClog);
				System.out.println("maxWaterClog Happend : "+maxWaterClog);
				System.out.println();
				
			}
		}
		return maxWaterClog;
	}
	public static void main(String[] args)
	{
		int[] array = {3,2,1,3,1,1,1,1,3};
		/*System.out.println("Maximum water clog at the end is "+ evalRainFall(array));*/
		
		int[] array1 = {1,2,3,1,1,3};
		System.out.println("Maximum water clog at the end is "+ evalRainFall(array1));
		/*
		                                                 
		|  |    |     |  |                             
		|| |    |    ||  |                               
		|||||||||   ||||||                             
		012345678
*/	}
}
