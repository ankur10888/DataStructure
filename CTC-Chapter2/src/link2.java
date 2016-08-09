// Q2 Implement an algorithm to find the nth to last element of a singly linked list.

public class link2 {

	int data;
	link2 next;
	link2(int value)
	{
		this.data=value;
		
	}
	public void displayLink()
	{
		System.out.println(this.data);
	}
}
class list
{

	link2 first;
	public list() {
	first=null;
	
	}
	public void insertLinkValue(int value)
	{
		link2 link= new link2(value);
	    link.next=first;
	    first=link;
		
	}
	public void displayLinkList()
	{
		//System.out.print(“List (first-->last): “);
		link2 current = first; // start at beginning of list
		while(current != null) // until end of list,
		{
		current.displayLink(); // print data
		current = current.next; // move to next link
		}
		System.out.println("");
	}
	
	public void a(link2 i,int n)
	{
		
		link2 p1 = i;
		link2 p2 = i;
			 for (int j = 0; j < n - 1; ++j) { // skip n-1 steps ahead
			 if (p2 == null) {
				 System.out.println("Not found");
			//return null; // not found since list size < n
			 }
			 p2 = p2.next;
			 }
			 while (p2.next != null) {
			 p1 = p1.next;
		p2 = p2.next;
			}
			//return p1;
			System.out.println(p1.data);
			
	}
	//find elements from n ----- last
	public link2 ntolastlink(link2 input, int n)
	{
		int count=0;
		while(input !=null)
		{count++;
			
			if(count>=n)
			{
				System.out.println(input.data);
				
			}
			input=input.next;
			
		}
		return null;
	}
	
}

//----------------------------------------------------
/*
 class Main
{
	 public static void main(String[] args) {
	list linklst= new list();
		linklst.insertLinkValue(10);
		linklst.insertLinkValue(20);
		linklst.insertLinkValue(30);
		linklst.insertLinkValue(40);
		linklst.insertLinkValue(50);
		linklst.insertLinkValue(60);
		linklst.insertLinkValue(70);
		linklst.insertLinkValue(80);
		linklst.displayLinkList();
		//linklst.ntolastlink(linklst.first,3);
		linklst.a(linklst.first,3);
		
		
	 }
	
	 
}
	*/
