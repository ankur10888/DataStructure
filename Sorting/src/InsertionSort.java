
public class InsertionSort {
	public static void main(String[] args) {
		int[] input={23,42,4,16,8,15};
		insertionSort(input);
	}

	public static void insertionSort(int input[])
	{
		//int[] sorted = new int[input.length]; 
		
		for(int i=0;i<input.length;i++)
		{
		      int temp =input[i];
		     
		      if(i>0)
		      {
		      for(int j=i-1; j>=0; j--)
		      {
		    	 if(temp<input[j])
		    	 {
		    		 input[j+1]=input[j];
		    		 input[j]=temp;
		    	 }
		    	  
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

