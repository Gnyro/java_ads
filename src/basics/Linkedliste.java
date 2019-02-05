package basics;

public class Linkedliste<E> implements IQueue<E> {


	Node<E> head;
	Node<E> tail;
	int pt;

	
	public Linkedliste(){

		head= new Node<E>(null,tail,tail);
		tail= new Node<E>(null,null,head);
		head.toNext(tail);
		
	}
	public void insert(Node<E> prev, E data){
		
	/* 
	 * um eine neue Node hinzufuegen
	 */
		Node<E> toInsert = new Node<E>(data,prev,prev.isNext());
		prev.isNext().toPrev(toInsert);
		prev.toNext(toInsert);
		prev.isNext().toNext(tail);
	
	}
	public void delete(Node<E> node){
		/*
		 * um eine Node zu loeschen wird die 2. die 1. ueberschreiben
		 */
		Node<E> next = node.isNext();
		head.toNext(next);
	
	}
	
    public Node<E> find(E dt) {
		tail.toData(dt);
		Node<E> pointer = head;
		int i=0;
		do {
			pointer = pointer.isNext();
			i++;
		}
		while(pointer.isData() != dt);
		pt=i;
		return pointer;
		
	}
	public void retrieve(){
		
	}
	public Linkedliste<E> concat(Linkedliste<E> lst){
		return this;
	}
	@Override
	public void addAll(IQueue<E> queue) throws FullQueueException {
		// TODO Auto-generated method stub	
	}
	@Override
	public void dequeue() throws EmptyQueueException, FullQueueException {
		//E old= head.isNext().isData();
		delete(head.isNext());			
	}
	@Override
	public void enqueue(E element) throws FullQueueException {
		insert(tail.isPrev(), element );	
	}
	@Override
	public E front() throws EmptyQueueException {
		return head.isNext().isData();
	}
	@Override
	public boolean isEmpty() {
		return head.isNext()==tail;	
	}
	@Override
	public boolean isFull() {
		
		return false;
	}
	
	public void print(){
		Node<E> node = head;
		System.out.println(head.isData());
		do{
			System.out.println(node.isNext().isData());
			node=node.isNext();
		}while (hasNext(node));

		System.out.println(tail.isData());
		}
	
	public boolean hasNext(Node<E> node){
		if (node.isNext() != tail)	{
			return true;
		}
		else
			return false;
		
	}
		
}



