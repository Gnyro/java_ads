package basics;

public class RingbufferTest {

	/**
	 * @param args
	 */
	static Ringbuffer<Integer> buff=new Ringbuffer<Integer>(5);
	public static void main(String[] args) throws FullQueueException, EmptyQueueException {
		buff.enqueue(23);
		buff.toString();
		
		buff.enqueue(2);
		 buff.toString();
		 
		 buff.dequeue();
		 buff.toString();
		 
		 buff.enqueue(23);
		 buff.toString();
		 
		 buff.enqueue(22);
		 buff.toString();
		 
		 buff.enqueue(21);
		 buff.toString();
		 
		 buff.enqueue(33);
		 buff.toString();
		 
		 buff.enqueue(12);
		 buff.toString();
		 
		 buff.dequeue();
		 buff.toString();
		
 		 buff.enqueue(44);
		 buff.toString();
		 
		 buff.dequeue();
		 buff.toString();
		 
         buff.dequeue();
         buff.toString();
		 
		 buff.dequeue();
		 buff.toString();
		 
		 buff.dequeue();
		 buff.toString();
		 
		 buff.dequeue();
		 buff.toString();
		 
		 buff.enqueue(88);
		 buff.toString();
		 
		 buff.dequeue();
		 buff.toString();
		
		 buff.dequeue();
		 buff.toString();
		
		 
	}

}
