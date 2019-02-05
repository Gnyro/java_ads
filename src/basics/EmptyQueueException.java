package basics;
/**
 * Eine EmptyQueueException kann geworfen werden, wenn eine Operation des Interfaces {@link a01.IQueue IQueue}
 * aufgerufen wird, die f�r eine leere Queue nicht m�glich ist.
 * @author Bernd Kahlbrandt
 *
 */
public class EmptyQueueException extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * Dieser Konstruktor setzt die Meldung zur Exception mittels eines Resource Bundles,
	 * so das sie einfach lokalisiert werden kann.
	 */
	public EmptyQueueException(){
		super(Messages.getString("EmptyQueueException.0"));
	}
}
