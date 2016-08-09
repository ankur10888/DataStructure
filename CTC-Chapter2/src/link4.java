
public class link4 {
	int data;
	link4 next;
	link4 (int value)
	{
		this.data=value;
		
	}
	public void displayLink()
	{
		System.out.println(this.data);
	}
}
class llist1
{

	link4  first;
	public llist1() {
	first=null;
	
	}
	public void insertLinkValue(int value)
	{
		link4 link= new link4(value);
	    link.next=first;
	    first=link;
		
	}
	public void displayLinkList()
	{
		//System.out.print(“List (first-->last): “);
		link4 current = first; // start at beginning of list
		while(current != null) // until end of list,
		{
		current.displayLink(); // print data
		current = current.next; // move to next link
		}
		System.out.println("");
	}
	
	
	public void addLink(link4 node1,link4 node2)
	{int a,carry=0;
	//link4 b=null;
		link4 finalNode ;
		while(node1!=null && node2!=null)
		{
			a= carry+ node1.data + node2.data;
			if(a>9)
			{
				carry=1;
			}else carry=0;
			a=a%10;
			link4 temp=new link4(a);
			finalNode=temp;
			
			System.out.println(finalNode.data);
			finalNode=finalNode.next;
			node1=node1.next;
			node2=node2.next;
		}
		
	}
}


class Main{
public static void main(String[] args) {
	
	llist1 linklst= new llist1();
	linklst.insertLinkValue(3);
	linklst.insertLinkValue(1);
	linklst.insertLinkValue(5);
	
	linklst.displayLinkList();
	
	llist1 linklst1= new llist1();
	linklst1.insertLinkValue(5);
	linklst1.insertLinkValue(9);
	linklst1.insertLinkValue(2);
	linklst1.displayLinkList();
	
	linklst.addLink(linklst.first,linklst1.first);
	
}

//LinkList lnk = new LinkList()
}

