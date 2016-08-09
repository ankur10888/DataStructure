
public class QueueMain {
	public static void main(String[] args) {
		QueueImpl Queue= new QueueImpl(10);
		
	 Queue.Enqueue("50");
	 Queue.Enqueue("60");
	 Queue.Enqueue("70");
	 Queue.Enqueue("80");
	 Queue.Enqueue("90");
	 
	 while(!Queue.isEmpty())
	 {
		 String value=Queue.Dequeue();
		 System.out.println(value);
	 }
	 
	}

}
