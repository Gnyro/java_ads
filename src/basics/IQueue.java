package basics;

/**
 * Interface mit einem Basissatz an Operationen f�r eine Queue.
 * @author Bernd Kahlbrandt
 *
 * @param <E>
 */
public interface IQueue<E> {
	/**
	 * Klassenvariable, um die Kapazit�t der Queue festzulegen, wenn der Nutzer sie nicht
	 * explizit festlegt.
	 */
	static final int DEFAULTSIZE = 20;
	/**
	 * Einf�gen eines neuen Elements am Ende der Queue.
	 * @param element Das neu einzuf�gende Element.
	 * 
	 * @throws FullQueueException  wenn die Queue voll ist. 
	 */
	void enqueue(E element) throws FullQueueException,EmptyQueueException;
	/**
	 * Entfernen des ersten Elements der Queue.
	 * @throws EmptyQueueException  wenn die Queue leer ist.
	 */
	void dequeue() throws EmptyQueueException, FullQueueException;
	/**
	 * Liefert das erste Elements der Queue.
	 * @throws EmptyQueueException  wenn die Queue leer ist.
	 */
	E front() throws EmptyQueueException;
	/**
	 * Diese Operation erm�glicht dem Nutzer, eine {@link exception.EmptyQueueException} beim 
	 * {@link IQueue#dequeue dequeue} zu vermeiden. 
	 * @return <b>true</b>, wenn die Queue leer ist, andernfalls <b>false</b>. 
	 */
	/**
	 * Dies ist eine Servicemethode f�r den Fall, dass eine Queue vergr��ert werden muss.
	 * Ein Nutzer der Queue kann bei Bedarf eine gr��ere anlegen und mit dieser Operation die
	 * bisherige, vielleicht schon voll gewordene, Queue in die neue kopieren. 
	 * @throws EmptyQueueException 
	 */
	void addAll(IQueue<E> queue) throws FullQueueException, EmptyQueueException;
	boolean isEmpty();
	/**
	 * Diese Operation erm�glicht dem Nutzer, eine {@link exception.FullQueueException} beim 
	 * {@link IQueue#enqueue dequeue} zu vermeiden. 
	 * @return <b>true</b>, wenn die Queue voll ist, andernfalls <b>false</b>. 
	 */
	boolean isFull();
}
