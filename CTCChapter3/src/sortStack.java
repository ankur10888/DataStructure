import java.util.Stack;;
public class sortStack {
	
	public static void main(String[] args) {

		Stack<Integer> stack1= new Stack<Integer>();
		Stack<Integer> stack2= new Stack<Integer>();
		
		stack1.push(25);
		stack1.push(15);
		stack1.push(45);
		stack1.push(5);
		stack1.push(125);
		
		while(!stack1.isEmpty())
		{
			int temp=stack1.pop();
			
			while(!stack2.isEmpty() && temp <stack2.peek())
			{
				stack1.push(stack2.pop());
			}
			stack2.push(temp);
			
				
			
		}
		while(!stack2.isEmpty())
		{
			System.out.println(stack2.pop());
		}
	}

}
