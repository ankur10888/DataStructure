


// Selection sort-- we consider firrst number as Min Value and compare it with the list and swap it with the min number in the list
//this way we can put min value in the first place then move to second number as MinValue and then compare it with the list and so one we 
//replace the number and sort all number as ascending elements...

public class Selection_Sort {
	
	public static void main(String[] args) {
		
		int[] input={15,45,4,3,34,5};
		
		selectionSort(input);
	}
	public static void selectionSort(int[] input)
	{
	//int minValue=0;
		for(int i=0;i<input.length;i++)
		{
			int minValue=input[i];
			for(int j=i;j<input.length;j++)
			{
				if(minValue>input[j])
				{
					minValue=input[j];
					input[j]=input[i];
					input[i]=minValue;
				}
				
			}
		}
		display(input);
		
	}
	
	public static void display(int[]input)
	{for(int i=0;i<input.length;i++)
	{
		System.out.println(input[i]);
	}
		
	}

}
