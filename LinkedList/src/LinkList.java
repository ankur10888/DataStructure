
public class LinkList {

	link first;
	
	public LinkList() {
first=null;
	}
	

	public void insertLink(int data)
	{
		link link1= new link(data);
		link1.next=first;
		first=link1;
	}
	
	public void displayLink()
	{
		link current=first;
		while(current!=null)
		{
			System.out.println("Data  :"  +current.data + "Reference :" +current.next);
			current=current.next;
		}
	}


	public link find(int data) {
		link current = first;
		if (current==null)
			return null;
		
		while(current!=null)
		{
			if(current.data==data)
				return current;
			current= current.next;
		}
		
		
		return current;
		
	}

	public link reverse(link head)
	{
		
		link current , next,previous=null;
		current=head;
		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		
		head = previous;
		first=head;
		return first;
		
	}

	@SuppressWarnings("unused")
	public link remove(int data) {
		 link current=first;
		   link previous=first;
		   
		   if(current==null)
		   { 
			   return null;
		   
		   }
		   else
		   {
			
			   while(current.data!=data)
			   {
				   if(current.next==null)
				   {
					   return null;
				   }
				   
				   else{
				 
				   previous=current;
				   current=current.next;
				   }
			   }
		   }
		   if(current==first)
		   {
			   first=current.next;
		  }
		   else
		   {
			   previous.next=current.next;
		   }
		   
		   
			
			return current;
		
	}

	
}

class link
{
int data;
link next;

link(int data)
{
	this.data=data;
}
	
}


