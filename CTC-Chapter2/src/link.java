import java.util.Hashtable;

//Remove duplicate from linklist

	public class link{
		int input;
		link next;
		link(int insertValue)
		{
			input=insertValue;
			
		}
		public void displayLink()
		{
			System.out.println(this.input);
		}
	}
	class linkList
	{
		link  first;
		
		public linkList() {
			first=null;
		}
		public void insertFirstElement(int inputElement)
		{
			link newLink= new link(inputElement);
			newLink.next=first;
			first=newLink;
			
			
		}
		
		
		public void deleteDuplicateLink(link input1)
		{
			Hashtable<Integer, Boolean> tbl = new Hashtable<Integer, Boolean>();
			link previous=null;
			while(input1!=null)
			{
				if(tbl.containsKey(input1.input))
				{
					previous.next=input1.next;
				}
				else
				{
					tbl.put(input1.input, true);
					previous=input1;
				}
				input1=input1.next;
			}
		
			
			
		}

		public void displayLinkList()
		{
			//System.out.print(“List (first-->last): “);
			link current = first; // start at beginning of list
			while(current != null) // until end of list,
			{
			current.displayLink(); // print data
			current = current.next; // move to next link
			}
			System.out.println("");
		}
		

		
	}
	/*
	 class Main{
		public static void main(String[] args) {
			//Q1 a= new Q1();
			
			linkList link1= new linkList();
			link1.insertFirstElement(50);
		link1.insertFirstElement(50);
		link1.insertFirstElement(50);
		link1.insertFirstElement(40);
		link1.insertFirstElement(50);
		link1.displayLinkList();
		link1.deleteDuplicateLink(link1.first);
		link1.displayLinkList();
		}

	}
	*/


