
public class PriorityQueueMain {
public static void main(String[] args) {
	PriorityQueue PQ= new PriorityQueue(10);
	PQ.insert(50);
	PQ.insert(20);
	PQ.insert(40);
	PQ.insert(45);
	PQ.insert(25);
	
	while(!PQ.isEmpty())
	{
		int value =PQ.remove();
		System.out.println(value);
		
	}
	
}


}
