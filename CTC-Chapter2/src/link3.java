

public class link3 {
	int data;
	link3 next;
 	link3 (int value)
	{
		this.data=value;
		
	}
	public void displayLink()
	{
		System.out.println(this.data);
	}
}
class llist
{

	link3  first;
	public llist() {
	first=null;
	
	}
	public void insertLinkValue(int value)
	{
		link3 link= new link3(value);
	    link.next=first;
	    first=link;
		
	}
	public void displayLinkList()
	{
		//System.out.print(“List (first-->last): “);
		link3 current = first; // start at beginning of list
		while(current != null) // until end of list,
		{
		current.displayLink(); // print data
		current = current.next; // move to next link
		}
		System.out.println("");
	}

	public link3 delete(int value,link3 link)
	{
		//link3 previous;
		link3 current=link;
		while(current!=null)
		{
			if(value==current.data)
			{
				link3 temp=current.next;
				current.data=temp.data;
				current.next=temp.next;
			   temp=null;
			}
			System.out.println(current.data);
			//link=current;
			current=current.next;
		}
		return current;
	}
}

	
/*
class Main{
public static void main(String[] args) {
	
	llist linklst= new llist();
	linklst.insertLinkValue(10);
	linklst.insertLinkValue(20);
	linklst.insertLinkValue(30);
	linklst.insertLinkValue(40);
	linklst.insertLinkValue(50);
	linklst.insertLinkValue(60);
	linklst.insertLinkValue(70);
	linklst.insertLinkValue(80);
	linklst.displayLinkList();
	link3 a =linklst.delete(30, linklst.first);
	//System.out.println("tere maa k");
	//linklst.displayLinkList();
	System.out.println("break");
	link3 current = a; // start at beginning of list
	while(current != null) // until end of list,
	{
	current.displayLink(); // print data
	current = current.next; // move to next link
	}
	System.out.println("");
}
}

*/
