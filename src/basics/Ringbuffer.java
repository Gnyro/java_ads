package basics;

public class Ringbuffer<E> implements IQueue<E> {

	E[] nodes;
	int head;
	int tail;
	int size;
	boolean full, empty, addA;
	int c = 0;
	Ringbuffer<E> rb;
	Ringbuffer<E> rr;
	IQueue<E> qu;

	public Ringbuffer(int s) {
		empty = true;
		full = false;
		size = s;
		head = 0;
		tail = 0;
		nodes = (E[]) (new Object[s]);
	}

	@Override
	public void addAll(IQueue<E> queue) throws EmptyQueueException,
			FullQueueException {

		if (c == 1) {
			E[] nodesTmp = (E[]) (new Object[size]);
			nodesTmp = nodes;
			rr = new Ringbuffer<E>(DEFAULTSIZE);
			nodes = (E[]) (new Object[DEFAULTSIZE]);

			do {
				for (int i = 0; i < nodesTmp.length; i++) {
					rr.enqueue(nodesTmp[i]);
				}
			} while (nodesTmp.length == 0);
			nodes = rr.nodes;
		}
		addA = true;
	}

	@Override
	public void dequeue() throws EmptyQueueException, FullQueueException {
		if (isEmpty())
			System.out.println("Queue is empty");

		else if (addA)
			remove();
		else {
			nodes[head] = null;
			full = false;
			head = head + 1;
			if (tail == head)
				empty = true;
			if (head >= size)
				head = 0;
		}
	}

	public void remove() throws FullQueueException, EmptyQueueException {
		if (nodes[head]==null) { 
			head = 0;
		}
		E[] node1 = (E[]) (new Object[DEFAULTSIZE]);
		int i, j;
		for (i = 0; i <= head; i++) {
			node1[i] = nodes[i];
		}
		rb = new Ringbuffer<E>(DEFAULTSIZE);
		rb.nodes = node1;
		for (j = head + 1; j < DEFAULTSIZE - (head + i); j++) {
			node1[j - 1] = nodes[j];
			if (nodes[tail]==null) tail--;
		}
		nodes = (E[]) (new Object[DEFAULTSIZE]);
		nodes = rb.nodes;

	}

	public void enqueue(E element) throws FullQueueException,
			EmptyQueueException {

		if (isFull()) {
			System.out.println("Queue is full ...");
			System.out.println("will continue ...");
			addAll(qu);
			insert(element);

		} else if (addA)
			insert(element);
		else {

			nodes[tail] = element;
			empty = false;
			tail = tail + 1;
			if (tail == head) {
				full = true;
			}
			if (tail >= size) {
				tail = 0;
			}
		}
	}

	public void insert(E e) throws FullQueueException, EmptyQueueException {
		E[] node1 = (E[]) (new Object[DEFAULTSIZE]);

		int i;
		for (i = 0; i <= tail; i++) {
			node1[i] = nodes[i];
		}
		rb = new Ringbuffer<E>(DEFAULTSIZE);

		rb.nodes = node1;
		rb.tail = tail;
		rb.head = head;
		rb.enqueue(e);
		head++;

		for (int j = tail; j < DEFAULTSIZE - (tail + i+1); j++) {
			node1[j + 1] = nodes[j];
		}
		nodes = (E[]) (new Object[DEFAULTSIZE]);
		nodes = rb.nodes;
		tail = rb.tail;

	}

	public E front() throws EmptyQueueException {
		if (empty) {
			isEmpty();
			return null;
		} else
			return nodes[head];

	}

	@Override
	public boolean isEmpty() {
		if (size == 0 || (tail == head && !full)) {
			empty = true;
			System.out.println(" Queue is empty ");
			return true;
		}
		return false;

	}

	@Override
	public boolean isFull() {
		if (tail == head && !empty) {
			full = true;
			c = 1;
			System.out.println(" Queue is full ");
			return true;
		}
		return false;
	}

	public String toString() {
		for (E e : nodes) {
			System.out.println(e + "" + '\n');
		}
		return nodes.toString();
	}
}
