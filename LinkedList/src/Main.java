
public class Main {

	public static void main(String[] args) {
		
			
				LinkList link1= new LinkList();
				link1.insertLink(25);
				link1.insertLink(45);
				link1.insertLink(55);
				link1.insertLink(65);
				link1.insertLink(75);
				link1.displayLink();
				
				
			link a =link1.find(58);
			if(a!=null)
			{
				System.out.println("Data found :" +a.data);
	
			}
			else
				{
				System.out.println("EMPTY");
				}
			
			link1.reverse(link1.first);
			
			link1.displayLink();
				}
			
			
	
}
