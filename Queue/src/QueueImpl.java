
// lonk-https://www.youtube.com/watch?v=okr-XE8yTO8
public class QueueImpl {
	
	int maxSize;
	int front;
	int rare;;
	String[] Queue;
	QueueImpl(int size)
	{
		maxSize=size;
		Queue= new String[maxSize];
		front=-1;
		rare=-1;
	}
	
	public void Enqueue(String value)
	{
		if(isFull())
			return;
		if(isEmpty())
		{
			rare=0;
			front=0;
			Queue[rare]=value;
		}
		else
		{	rare=rare+1;
		Queue[rare]=value;
	}}
	
	public String Dequeue()
	{
		if(isEmpty())
			return "";
		else if(rare==front)
		{String a=Queue[front];
			rare=-1;front=-1;
			return a;
			
		}
		else
		{
			//Queue[front]="";
			front=front+1;
			
		}
		
		return Queue[front-1];
		
	}
	public boolean isFull()
	{
		if(rare==maxSize)
		{
			return true;
		}
		else
			return false;
	}

	public boolean isEmpty()
	{
		if(rare==-1 && front==-1)
		{
			return true;
		}
		else
			return false;
		
	}
}
