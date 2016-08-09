


//Bubble sort first we will compare first two elements and swap them if left one is greater than right and move
//move forward till the end by this we can easily sort the biggest element and placed it to end... next we will move to next element and in the
//inner loop we reduce the traversal by 1-i so we will not see the sorted last element .

public class Bubble_Sort {
	public  static void main(String[] arg)
	{
		int a[]={4,6,8,3,5,50,85,1,97,54};
		bubbleSort(a);
		
	}

	public static void bubbleSort(int[] input)
	{
		for(int i=0;i< input.length;i++)
		{
			for(int j=0; j<input.length-1-i;j++)
			{
				if(input[j]>input[j+1])
				{
					int temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
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
