package basics;

public class Node<E>{
	E data;
	Node<E> nextNode;
	Node<E> prevNode;
	
	Node(E dt,Node<E> next,Node<E> prev){
		nextNode= next;
		prevNode= prev;
		data = dt;
	}
	public Node<E> isNext(){
		return nextNode;
	}
	

	public Node<E> isPrev(){
		return prevNode;
	}
	
	public void toNext(Node<E> next) {
		nextNode = next;
	}
	public void toPrev(Node<E> prev) {
		prevNode= prev;
	}
	public E isData(){
		return data;
	}
	public void toData(E newdata) {
		data= newdata;
	}
	

}
