
public class PriorityQueue {

	int max;
	int[] Queue;
	int rare;
	int front;int nitems=0;
	public PriorityQueue(int size) {
	max=size;
	Queue=new int[max];
	rare=-1;
	front=1;
	
	
	}
	
	public void insert(int newValue)
	{
		if(nitems==0)
		{
			Queue[nitems]=newValue;
			nitems++;
		}
		else
		{int j;
			for(j=nitems-1;j>=0;j--)
			{
			if(newValue>Queue[j])
			{
				Queue[j+1]=Queue[j];
				
			}
			else
				break;
			}
		
		Queue[j+1]=newValue;
		nitems++;
		}
		}
	
	
	public boolean isEmpty()
	{
		if(nitems==0)
			return true;
		else
			return false;
	}
	
	public int remove()
	{
		nitems=nitems-1;
		return Queue[nitems];
	}
}
