

public class Stack {
	int top;
	int top1;
	int Stackarray[];
	int minStack[];
	int sizeStack;
	
	Stack(int s)
	{
		sizeStack=s;
		//Stack<Integer>=new Stack<Integer>;
		minStack= new int[sizeStack];
		
		top=-1;
		top1=-1;
		Stackarray= new int[sizeStack];
	}
	public void push(int value)
	{
		
		if(Stackarray[0]==0)
		{
			top++; 
		top1++;
			Stackarray[top]=value;
			minStack[top1]=value;
		}
		else
		{
			if(value>minStack[top1])
			{
				top++;
				Stackarray[top]=value;
				
			}
			else{

				top++; 
			top1++;
				Stackarray[top]=value;
				minStack[top1]=value;
			}
			
		}
		
	}
	public int pop()
	{
		int value=Stackarray[top];
		top--;
		return value;
	}
	
	public int minValue()
	{
		return minStack[top1];
	}
	
public static void main(String[] args) {
	Stack stack= new Stack(15);
	stack.push(45);
	stack.push(100);
	stack.push(50);
     stack.push(85);
     stack.push(15); stack.push(55); stack.push(35); stack.push(5); stack.push(3); stack.push(41); stack.push(25); stack.push(10);
    // stack.pop();6
     //stack.peak();
     //stack.pop();
    
     while(!stack.isEmpty())
     {
    	 long value=stack.pop();
    	 System.out.println(value);
     }
    int min=  stack.minValue();
	System.out.println("Min Value is ");
	System.out.println(min);
}

public boolean isEmpty() // true if stack is empty
{
return (top == -1);
}

}
