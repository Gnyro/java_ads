package priority_queue;

public interface IPriorityQ<T> {
	public boolean isEmpty();
	public boolean isFull();
	public void insert(Comparable<T> Item);
	public Comparable<T> remove();
	public Comparable<T> front();
	public void enqueue();
	public Comparable<T> dequeue();
	public T getPriority(T Item);
	public void setPriority(T Item, T prioritty);
}
