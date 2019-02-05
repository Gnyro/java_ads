package basics;
/**
 * Eine FullQueueException kann geworfen werden, wenn eine Operation des Interfaces {@link a01.IQueue IQueue}
 * aufgerufen wird, die nicht m�glich ist, weil die Queue voll ist oder durch eine Operation voll wird.
 * @author Bernd Kahlbrandt
 *
 */
public class FullQueueException extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * Dieser Konstruktor setzt die Meldung zur Exceptions mittel eines Resource Bundles,
	 * so das sie einfach lokalisiert werden kann.
	 */
	public FullQueueException(){
		super(Messages.getString("FullQueueException.0")); //$NON-NLS-1$
	}
}
