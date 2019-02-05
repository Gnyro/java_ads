package basics;

public class LinkedlisteTest {

	/**
	 * @param args
	 * @throws FullQueueException 
	 * @throws EmptyQueueException 
	 */
	public static void main(String[] args) throws FullQueueException, EmptyQueueException {
		
		Linkedliste<Integer> dll = new Linkedliste<Integer>();
		
		dll.enqueue(25);
		dll.enqueue(33);
		dll.enqueue(77);
		dll.enqueue(99);
		dll.dequeue();
		dll.dequeue();
		dll.enqueue(125);
		dll.print();
		dll.find(99);
		System.out.println(dll.pt);
		
	}

}
