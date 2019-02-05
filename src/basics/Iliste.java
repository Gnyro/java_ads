package basics;

public interface Iliste<E> {
    public void insert(Node<E> prev, E data);
	public void delete(Node<E> nod);
	public Node<E> find(E dt);
	public void retrieve();
	public Linkedliste<E> concat(Linkedliste<E> lst);
}
